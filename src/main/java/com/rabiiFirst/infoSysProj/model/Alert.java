package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlert;

    private Date dateAlert;
    private String message;
    private enum typeAlert {
        LEGER, CRITIQUE, STOCK_SECURITE // add more if you want
    }
    private typeAlert typeAlert;
}
