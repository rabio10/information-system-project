package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class LigneRetour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneRetour;

    private int quantite;


    // referencing
    @OneToOne
    @JoinColumn(name = "idLigneDeLivraisonFk")
    private LigneDeLivraison ligneDeLivraison;

    @ManyToOne
    @JoinColumn(name = "idRetourFk")
    private Retour retour;
}
