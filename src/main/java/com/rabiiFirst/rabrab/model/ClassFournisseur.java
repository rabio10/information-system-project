package com.rabiiFirst.rabrab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClassFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClassFournisseur;
    private char nomClassFournisseur;
    private int seuilClassFournisseur;

}
