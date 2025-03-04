package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LigneDeReception {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneReception;

    private int quantite;

    //TODO : 3 attributes related to : ligne de commande, reception, produit
}
