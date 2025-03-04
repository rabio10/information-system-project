package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.LigneRetour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneRetourRepo extends JpaRepository<LigneRetour, Integer> {
}
