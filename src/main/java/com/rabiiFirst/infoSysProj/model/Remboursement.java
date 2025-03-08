package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Remboursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRemboursement;

    private Date dateRemboursement;
    private double montantRemboursement;

    // referencing

    @OneToOne
    @JoinColumn(name = "idRetourFk")
    private Retour retour;
}
