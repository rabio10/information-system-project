package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

@Entity
public class LigneDeReception {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneReception;

    private int quantite;

    // referencing
    @ManyToOne
    @JoinColumn(name = "idLigneDeCommandeFournisseurFk")
    private LigneDeCommandeFournisseur LigneDeCommandeFournisseur;

    @ManyToOne
    @JoinColumn(name = "idReceptionFk")
    private Reception reception;
}
