package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    private String nomClient;
    private String prenomClient;
    private String adresseClient;
    private String telephoneClient;
    private String emailClient;
    private String codePostalClient;
    private String villeClient;

    // referencing
    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClient;
}
