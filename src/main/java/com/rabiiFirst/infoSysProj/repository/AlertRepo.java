package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepo extends JpaRepository<Alert, Integer> {
}
