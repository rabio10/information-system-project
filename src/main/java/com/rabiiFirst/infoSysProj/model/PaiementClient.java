package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

@Entity
public class PaiementClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaiementClient;

    private enum methodePay {
        CASH,
        VIREMENT,
        CHEQUE
    }
    private methodePay methodePayementClient;
    private double montantPayeeClient;

    // referencing

    // let's suppose that one facture client est lié à une seul paiement client
    @OneToOne
    @JoinColumn(name = "idFactureClientFk")
    private FactureClient factureClient;
}
