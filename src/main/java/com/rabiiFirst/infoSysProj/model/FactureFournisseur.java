package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class FactureFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactureFournisseur;

    private Date dateFactureFournisseur;
    private double montantTotalFactureFournisseur;

    // referencing
    @OneToOne
    @JoinColumn(name = "idCommandeFournisseurFk")
    private CommandeFournisseur commandeFournisseur;

    @OneToMany(mappedBy = "factureFournisseur")
    private List<PaiementFournisseur> paiementFournisseurs;
}
