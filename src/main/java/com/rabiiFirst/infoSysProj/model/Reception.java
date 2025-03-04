package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Reception {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReception;

    private Date dateReception;
    private enum statusReception {
        // TODO : add status
    }
    private statusReception statusReception;

    // TODO: 1 attribute : controle , linked to controle
}
