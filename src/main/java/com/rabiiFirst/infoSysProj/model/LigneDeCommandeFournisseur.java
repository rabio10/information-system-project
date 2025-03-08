package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class LigneDeCommandeFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneDeCommandeFournisseur;

    private int quantite;
    private double prixUnitaire;

    // referencing

    @ManyToOne
    @JoinColumn(name = "idCommandeFournisseurFk")
    private CommandeFournisseur commandeFournisseur;

    @OneToMany(mappedBy = "LigneDeCommandeFournisseur")
    private List<LigneDeReception> ligneDeReception;

    @ManyToOne
    @JoinColumn(name = "idProduitFk")
    private Produit produit;
}
