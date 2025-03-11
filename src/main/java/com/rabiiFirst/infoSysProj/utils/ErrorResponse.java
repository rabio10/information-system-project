package com.rabiiFirst.infoSysProj.utils;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;

import java.io.Serializable;

public class ErrorResponse implements org.springframework.web.ErrorResponse {
    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public HttpStatusCode getStatusCode() {
        return null;
    }

    @Override
    public ProblemDetail getBody() {
        return null;
    }
}
