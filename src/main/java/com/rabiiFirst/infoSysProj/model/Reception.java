package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Reception {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReception;

    private Date dateReception;
    private enum statusReception {
        // TODO : add status
    }
    private statusReception statusReception;

    // referencing

    @OneToMany(mappedBy = "reception")
    private List<LigneDeReception> ligneDeReception;

    @OneToOne
    @JoinColumn(name = "idControleFk")
    private Controle controle;
}
