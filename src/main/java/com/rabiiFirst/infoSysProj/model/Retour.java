package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Retour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRetour;

    private Date dateRetour;
    private enum statusRetour {
        // idk !!
    }
    private statusRetour statusRetour;
}
