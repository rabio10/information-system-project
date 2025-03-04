package com.rabiiFirst.infoSysProj.repository;

import com.rabiiFirst.infoSysProj.model.ClassFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassFournisseurRepo extends JpaRepository<ClassFournisseur, Integer> {
}
