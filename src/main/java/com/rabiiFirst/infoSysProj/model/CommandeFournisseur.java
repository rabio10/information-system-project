package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class CommandeFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommandeFournisseur;

    private Date dateCommandeFournisseur;
    private float montantTotalCommandeFournisseur;
    private enum statusCmd {
        EN_COURS,
        VALIDEE,
        LIVREE
    }
    private statusCmd statusCommandeFournisseur;
    private int delaiLivraisonCommandeFournisseur;

    // referencing
    @ManyToOne
    @JoinColumn(name = "idFournisseurFK")
    private Fournisseur fournisseur;

    @OneToOne
    @JoinColumn(name = "idFactureFournisseurFk")
    private FactureFournisseur factureFournisseur;
}
