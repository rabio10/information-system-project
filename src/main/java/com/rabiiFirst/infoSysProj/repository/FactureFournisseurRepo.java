package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.FactureFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureFournisseurRepo extends JpaRepository<FactureFournisseur, Integer> {
}
