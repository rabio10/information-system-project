package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.PaiementFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementFournisseurRepo extends JpaRepository<PaiementFournisseur, Integer> {
}
