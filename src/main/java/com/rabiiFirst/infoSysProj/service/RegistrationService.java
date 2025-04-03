package com.rabiiFirst.infoSysProj.service;

import com.rabiiFirst.infoSysProj.model.AppUser;
import com.rabiiFirst.infoSysProj.model.Token;
import com.rabiiFirst.infoSysProj.utils.EmailSender;
import com.rabiiFirst.infoSysProj.utils.RegistrationRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegistrationService {
    private final AppUserService appUserService;
    private final TokenService tokenService;
    private final EmailSender emailSender;

    public String register(RegistrationRequest request){
        AppUser appUser = new AppUser(
                request.getFirstname(),request.getLastname(), AppUser.Role.valueOf(request.getRole()) ,request.getEmail(), request.getPassword()
        );
        String token = appUserService.signUpUser(appUser);
        String confirmationLink = "http://localhost:8080/registration/confirmation?token=" + token;
        // send the email
        emailSender.send(request.getEmail(), buildEmail(request.getFirstname(), confirmationLink));
        return token;
    }

    @Transactional
    public String confirmToken(String token){
        String loginLink = "http://localhost:8080/login?token=" + token;
        Token confirmationToken = tokenService.getToken(token).orElseThrow(()->new IllegalStateException("token not found"));

        if (confirmationToken.getConfirmedAt() != null){
            throw new IllegalStateException(buildConfirmedPage(loginLink,"Email already confirmed."));
        }
        LocalDateTime expireAt = confirmationToken.getExpiresAt();

        if (expireAt.isBefore(LocalDateTime.now())){
            throw new IllegalStateException("token expired");
        }

        tokenService.setConfirmedToken(token);
        appUserService.enableAppUser(confirmationToken.getAppUser().getEmail());
        return buildConfirmedPage(loginLink,"Email Confirmed");
    }

    private String buildEmail(String name, String link) {
        return
                "<p> Hi " + name +
                        ",</p>" +
                        "<p> Thank you for registering. Please click on the below link to activate your account: </p>" +
                        "<blockquote><p> <a href=\"" + link + "\">Activate Now</a> </p></blockquote>\n Link will expire in 10 minutes.";
    }
    private String buildConfirmedPage(String link, String message){
        return "<p> " + message + ". Please click on the below link to Login: </p>" +
                "<blockquote><p> <a href=\"" + link + "\">Login</a> </p>";
    }

    // constructor

    public RegistrationService(AppUserService appUserService, TokenService tokenService, EmailSender emailSender) {
        this.appUserService = appUserService;
        this.tokenService = tokenService;
        this.emailSender = emailSender;
    }
}
