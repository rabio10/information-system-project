package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.MouvementDeStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MouvementDeStockRepo extends JpaRepository<MouvementDeStock, Integer> {
}
