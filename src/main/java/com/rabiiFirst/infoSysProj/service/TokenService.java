package com.rabiiFirst.infoSysProj.service;

import com.rabiiFirst.infoSysProj.model.Token;
import com.rabiiFirst.infoSysProj.repository.TokenRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TokenService {
    private final TokenRepo tokenRepo;

    public void saveConfirmationToken(Token token) {
        tokenRepo.save(token);
    }

    public Optional<Token> getToken(String token){
        return tokenRepo.findByToken(token);
    }

    public int setConfirmedToken(String token) {
        return tokenRepo.updateConfirmedAt(token, LocalDateTime.now());
    }

    // constructor

    public TokenService(TokenRepo tokenRepo) {
        this.tokenRepo = tokenRepo;
    }
}
