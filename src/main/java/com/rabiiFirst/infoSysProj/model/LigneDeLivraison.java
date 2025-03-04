package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LigneDeLivraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneDeLivraison;

    private int quantiteLivraison;

    //TODO: 3 attributes : produit, lignedecommande, livraison
}
