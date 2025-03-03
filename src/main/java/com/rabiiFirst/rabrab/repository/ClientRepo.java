package com.rabiiFirst.rabrab.repository;

import com.rabiiFirst.rabrab.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Integer> {
}
