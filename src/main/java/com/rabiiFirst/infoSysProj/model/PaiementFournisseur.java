package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

@Entity
public class PaiementFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaiementFournisseur;

    private enum methodePay {
        CASH,
        VIREMENT,
        CHEQUE
    }
    private methodePay methodePayementFournisseur;
    private double montantPayeeFournisseur;

    // referencing

    @ManyToOne
    @JoinColumn(name = "idFactureFournisseurFk")
    private FactureFournisseur factureFournisseur;
}
