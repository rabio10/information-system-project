package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Retour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRetour;

    private Date dateRetour;
    private enum statusRetour {
        // idk !!
    }
    private statusRetour statusRetour;

    // referencing

    @OneToMany(mappedBy = "retour")
    private List<LigneRetour> ligneRetour;

    @OneToOne
    @JoinColumn(name = "idRemboursementFk",nullable = true)
    private Remboursement remboursement;
}
