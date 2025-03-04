package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFournisseur;

    private String nomFournisseur;
    private String telephoneFournisseur;
    private String emailFournisseur;
    private String adresseFournisseur;

    // referencing
//    @ManyToOne
//    @JoinColumn(name = "idClassFournisseur")
//    private ClassFournisseur classFournisseur;
}
