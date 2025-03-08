package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

@Entity
public class LigneDeLivraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneDeLivraison;

    private int quantiteLivraison;


    // referencing

    // let's assume that un ligne de commande client est lié par un seul ligne de livraison
    // ya3ni la livraison d'une qte de produit x se fait une seul fois (tout la qte est livré dans une seul livraison)
    @OneToOne
    @JoinColumn(name = "idLigneDeCommandeClientFk")
    private LigneDeCommandeClient LigneDeCommandeClient;

    @OneToOne
    @JoinColumn(name = "idLigneRetourFk", nullable = true)
    private LigneRetour ligneRetour;

    @ManyToOne
    @JoinColumn(name = "idLivraisonFk")
    private Livraison livraison;

}
