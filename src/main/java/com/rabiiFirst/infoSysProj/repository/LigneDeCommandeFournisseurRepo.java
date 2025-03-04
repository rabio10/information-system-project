package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.LigneDeCommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneDeCommandeFournisseurRepo extends JpaRepository<LigneDeCommandeFournisseur, Integer> {
}
