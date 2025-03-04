package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Remboursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRemboursement;

    private Date dateRemboursement;
    private double montantRemboursement;

    // TODO: attribute Retour(linked to retour)
}
