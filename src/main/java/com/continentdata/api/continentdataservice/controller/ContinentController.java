package com.continentdata.api.continentdataservice.controller;

import com.continentdata.api.continentdataservice.model.Continent;
import com.continentdata.api.continentdataservice.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/continents")
public class ContinentController {

    private final ContinentService continentService;

    @Autowired
    public ContinentController(ContinentService continentService) {
        this.continentService = continentService;
    }

    @GetMapping
    public Set<Continent> getAllContinents() {
        return continentService.getAllContinents();
    }
}