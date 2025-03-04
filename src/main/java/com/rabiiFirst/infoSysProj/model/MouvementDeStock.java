package com.rabiiFirst.infoSysProj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class MouvementDeStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMouvementDeStock;
    private int produitId;
    private int quantite;
    private Date dateMouvementDeStock;
    // status ? idk ach ghaykono les status possible hna !!
    // tiban lia nefsshom ghaykono f selectionActions
    // TODO : relation with selectionActions, and ass the class : selectionActions ;
    //  no need foe typeSelectionActions you can just make it as enum
}
