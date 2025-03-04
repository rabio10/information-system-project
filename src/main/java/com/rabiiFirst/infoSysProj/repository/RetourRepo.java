package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.Retour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetourRepo extends JpaRepository<Retour, Integer> {
}
