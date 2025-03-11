package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFournisseur;

    @NotNull
    @Column(nullable = false)
    private String nomFournisseur;
    private String telephoneFournisseur;
    private String emailFournisseur;
    private String adresseFournisseur;

    // referencing

    @ManyToOne
    @JoinColumn(name = "idClassFournisseur", nullable = false)
    private ClassFournisseur classFournisseur;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;

    // getters

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public String getTelephoneFournisseur() {
        return telephoneFournisseur;
    }

    public String getEmailFournisseur() {
        return emailFournisseur;
    }

    public String getAdresseFournisseur() {
        return adresseFournisseur;
    }

    public ClassFournisseur getClassFournisseur() {
        return classFournisseur;
    }

    // setters

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public void setTelephoneFournisseur(String telephoneFournisseur) {
        this.telephoneFournisseur = telephoneFournisseur;
    }

    public void setEmailFournisseur(String emailFournisseur) {
        this.emailFournisseur = emailFournisseur;
    }

    public void setAdresseFournisseur(String adresseFournisseur) {
        this.adresseFournisseur = adresseFournisseur;
    }

    public void setClassFournisseur(ClassFournisseur classFournisseur) {
        this.classFournisseur = classFournisseur;
    }
}
