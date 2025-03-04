package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeClientRepo extends JpaRepository<CommandeClient, Integer> {
}
