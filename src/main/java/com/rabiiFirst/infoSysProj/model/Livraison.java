package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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

    // BonDeLivraison (idk ach ghaykono attributes dialha) hadchi 3lach madrthach

    // referencing

    @OneToMany(mappedBy = "livraison")
    private List<LigneDeLivraison> ligneDeLivraison;
}
