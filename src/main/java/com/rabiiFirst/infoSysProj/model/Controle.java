package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Controle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idControle;

    private Date dateControle;
    private int produitID; // the controlled produit , idk if it's correct b7al f diagram de class
    private enum statusControle {
        BON, ACCEPTABLE, MAUVAIS  // if there's smth to add
    }
    private statusControle statusControle;

    // referencing
    @OneToOne
    @JoinColumn(name = "idReceptionFk")
    private Reception reception;
}
