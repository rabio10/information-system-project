package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class FactureClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactureClient;

    private Date dateFactureClient;
    private double montantTotalFactureClient;

    // referencing

    @OneToOne
    @JoinColumn(name = "idCommandeClientFk", nullable = true)
    private CommandeClient commandeClient;

    // let's suppose that one facture client est lié à une seul paiement client
    @OneToOne
    @JoinColumn(name = "idPaiementClientFk")
    private PaiementClient paiementClient;
}
