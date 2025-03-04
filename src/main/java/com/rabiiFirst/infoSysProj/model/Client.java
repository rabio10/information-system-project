package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

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
}
