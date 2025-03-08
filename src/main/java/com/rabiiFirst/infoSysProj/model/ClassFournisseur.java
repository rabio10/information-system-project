package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity
public class ClassFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClassFournisseur;
    private char nomClassFournisseur;
    private int seuilClassFournisseur;

    // referencing

    @OneToMany(mappedBy = "classFournisseur")
    private Collection<Fournisseur> fournisseur;

    // getters and setters

    public Collection<Fournisseur> getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Collection<Fournisseur> fournisseur) {
        this.fournisseur = fournisseur;
    }
}
