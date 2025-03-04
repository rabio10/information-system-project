package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLivraison;

    private Date dateLivraison;
    private enum statusLivraison {
        PREPARATION, EN_COURS, LIVREE
    }
    private statusLivraison statusLivraison;

    // TODO: relations, and a class : BonDeLivraison (idk ach ghaykono attributes dialha)
}
