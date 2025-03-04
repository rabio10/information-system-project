package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ClassFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClassFournisseur;
    private char nomClassFournisseur;
    private int seuilClassFournisseur;

    @OneToMany(mappedBy = "Fournisseur")
    private List<Fournisseur> fournisseurs;

}
