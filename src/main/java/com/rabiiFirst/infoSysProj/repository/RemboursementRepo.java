package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.Remboursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemboursementRepo extends JpaRepository<Remboursement, Integer> {
}
