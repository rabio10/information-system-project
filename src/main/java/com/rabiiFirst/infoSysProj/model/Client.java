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

    // getters

    public int getIdClient() {
        return idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public String getTelephoneClient() {
        return telephoneClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public String getCodePostalClient() {
        return codePostalClient;
    }

    public String getVilleClient() {
        return villeClient;
    }

    // setters


    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public void setTelephoneClient(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public void setCodePostalClient(String codePostalClient) {
        this.codePostalClient = codePostalClient;
    }

    public void setVilleClient(String villeClient) {
        this.villeClient = villeClient;
    }
}
