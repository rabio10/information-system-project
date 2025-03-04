package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class FactureFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactureFournisseur;

    private Date dateFactureFournisseur;
    private double montantTotalFactureFournisseur;
}
