package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.FactureClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureClientRepo extends JpaRepository<FactureClient, Integer> {
}
