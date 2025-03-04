package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.Controle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControleRepo extends JpaRepository<Controle, Integer> {
}
