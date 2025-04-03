package com.rabiiFirst.infoSysProj.controller;

import com.rabiiFirst.infoSysProj.service.RegistrationService;
import com.rabiiFirst.infoSysProj.utils.RegistrationRequest;
import jakarta.servlet.Registration;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
    private RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<String> register(@RequestBody @Validated RegistrationRequest request) {
        return ResponseEntity.ok(registrationService.register(request));
    }

    @GetMapping("/confirmation")
    public ResponseEntity<String> confirm(@RequestParam("token") String token) {
        return ResponseEntity.ok(registrationService.confirmToken(token));
    }

    // constructors

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
}
