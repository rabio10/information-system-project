package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class CommandeClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommandeClient;

    private Date dateCommande;
    private enum statusCommandeClient {
        EN_ATTENTE, EN_COURS_DE_TRAITEMENT, TRAITE
    }
    private statusCommandeClient statusCommande;

    // TODO: attributes client

}
