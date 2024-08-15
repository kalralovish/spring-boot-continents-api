package com.continentdata.api.continentdataservice.repository;

import com.continentdata.api.continentdataservice.model.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface ContinentRepository extends JpaRepository<Continent, String> {
    @Query("SELECT c FROM Continent c")
    Set<Continent> findAllAsSet();
}