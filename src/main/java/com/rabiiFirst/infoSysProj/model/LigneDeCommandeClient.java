package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LigneDeCommandeClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneDeCommandeClient;

    private int quantite;
    private double prixUnitaire;

    // TODO: attributes : produit(linked to produit), commande(linked to commande)
}
