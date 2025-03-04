package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.Reception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionRepo extends JpaRepository<Reception, Integer> {
}
