package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

@Entity
public class LigneDeCommandeClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneDeCommandeClient;

    private int quantite;
    private double prixUnitaire;


    // referencing

    @ManyToOne
    @JoinColumn(name = "produitIdFk")
    private Produit produit;

    // let's assume that un ligne de commande client est lié par un seul ligne de livraison
    // ya3ni la livraison d'une qte de produit x se fait une seul fois (tout la qte est livré dans une seul livraison)
    @OneToOne
    @JoinColumn(name = "idLigneDeLivraisonFk")
    private LigneDeLivraison ligneDeLivraison;

    @ManyToOne
    @JoinColumn(name = "idCommandeClientFk")
    private CommandeClient commandeClient;
}
