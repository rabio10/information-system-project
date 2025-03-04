package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.LigneDeCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneDeCommandeClientRepo extends JpaRepository<LigneDeCommandeClient, Integer> {
}
