package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LigneRetour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneRetour;

    private int quantite;

    // TODO: relations(ligne de livraison, retour) , and attribute produit
}
