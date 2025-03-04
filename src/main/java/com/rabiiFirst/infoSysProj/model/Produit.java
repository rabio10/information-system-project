package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduit;

    private String nom;
    private String description;
    private double prix;
    private double cout;
    private int quantiteEnStock;
    private Boolean stockOK;

    // TODO: all relations with other classes
}
