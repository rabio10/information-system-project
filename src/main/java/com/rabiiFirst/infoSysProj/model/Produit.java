package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.List;

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

    // referencing
    @OneToMany(mappedBy = "produit")
    private List<LigneDeCommandeFournisseur> ligneDeCommandeFournisseur;

    @OneToMany(mappedBy = "produit")
    private List<MouvementDeStock> mouvementDeStock;

    @OneToMany(mappedBy = "produit")
    private List<LigneDeCommandeClient> ligneDeCommandeClient;

    @ManyToOne
    @JoinColumn(name = "idAlertFk", nullable = true)
    private Alert alert;
}
