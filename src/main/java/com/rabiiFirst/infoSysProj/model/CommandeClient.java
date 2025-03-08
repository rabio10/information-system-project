package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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

    // referencing
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneDeCommandeClient> ligneDeCommandeClients;

    @ManyToOne
    @JoinColumn(name = "idClientFk")
    private Client client;

    @OneToOne
    @JoinColumn(name = "idFactureClientFk")
    private FactureClient factureClient;

    // madrtch bonDeCommande 7itach idk achno ghaykon fiha f attributs o ma3rftch wach atsla7 lchi haja
}
