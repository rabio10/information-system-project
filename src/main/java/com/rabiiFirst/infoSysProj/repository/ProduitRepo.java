package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends JpaRepository<Produit, Integer> {
}
