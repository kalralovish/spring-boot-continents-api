package com.continentdata.api.continentdataservice.service;

import com.continentdata.api.continentdataservice.model.Continent;
import com.continentdata.api.continentdataservice.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Service
public class ContinentService {

    private final ContinentRepository continentRepository;
    private final WebClient webClient;

    @Autowired
    public ContinentService(ContinentRepository continentRepository, WebClient.Builder webClientBuilder) {
        this.continentRepository = continentRepository;
        this.webClient = webClientBuilder.baseUrl("https://dummy-json.mock.beeceptor.com").build();
    }

    @Transactional
    public void fetchAndSaveContinents() {
        Continent[] continents = webClient.get()
                .uri("/continents")
                .retrieve()
                .bodyToMono(Continent[].class)
                .block();

        if (continents != null) {
            Set<Continent> continentSet = new HashSet<>(Arrays.asList(continents));
            continentRepository.saveAll(continentSet);
        }
    }

    @Transactional(readOnly = true)
    public Set<Continent> getAllContinents() {
        return continentRepository.findAllAsSet();
    }
}