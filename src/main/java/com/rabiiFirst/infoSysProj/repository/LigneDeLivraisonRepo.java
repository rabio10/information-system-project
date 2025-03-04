package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.LigneDeLivraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneDeLivraisonRepo extends JpaRepository<LigneDeLivraison, Integer> {
}
