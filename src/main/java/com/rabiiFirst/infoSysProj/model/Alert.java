package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlert;

    private Date dateAlert;
    private String message;
    private enum typeAlert {
        LEGER, CRITIQUE, STOCK_SECURITE // add more if you want
    }
    private typeAlert typeAlert;

    // hado zdthom mn 3ndi , i guess ghay5sso

    @ManyToOne
    @JoinColumn(name = "idProduitFk")
    private Produit produit;
}
