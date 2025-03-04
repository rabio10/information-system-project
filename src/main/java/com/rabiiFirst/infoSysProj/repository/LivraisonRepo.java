package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivraisonRepo extends JpaRepository<Livraison, Integer> {
}
