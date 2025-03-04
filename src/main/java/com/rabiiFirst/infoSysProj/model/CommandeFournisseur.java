package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class CommandeFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommandeFournisseur;

    private Date dateCommandeFournisseur;
    private float montantTotalCommandeFournisseur;
    private enum statusCmd {
        EN_COURS,
        VALIDEE,
        LIVREE
    }
    private statusCmd statusCommandeFournisseur;
    private int delaiLivraisonCommandeFournisseur;
}
