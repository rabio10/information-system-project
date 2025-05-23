package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Integer> {
}
