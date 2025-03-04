package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LigneDeCommandeFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneDeCommandeFournisseur;

    private int quantite;
    private double prixUnitaire;

    // TODO : two attributes related to produit and commandeFournisseur

}
