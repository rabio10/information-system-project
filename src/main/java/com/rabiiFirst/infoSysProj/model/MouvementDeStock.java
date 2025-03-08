package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class MouvementDeStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMouvementDeStock;
    private int produitId;
    private int quantite;
    private Date dateMouvementDeStock;
    private enum selectionAction {
        AJOUTER_AU_STOCK, RETIRER_DU_STOCK
    }
    private selectionAction action;
    private enum statusAction {
        EN_ATTENTE, EN_COURS, FAITE
    }
    private statusAction statusAction;
    // tiban lia nefsshom ghaykono f selectionActions hadchi 3lach madrtch table dial
    // selectionAction and typeSelectionAction o 3awdthom b enum lkola w7da o sf
    // 7itach makain lach , enum tatdir lkhedma


    // referencing
    @ManyToOne
    @JoinColumn(name = "produitIdFk")
    private Produit produit;
}
