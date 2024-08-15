package com.continentdata.api.continentdataservice;

import com.continentdata.api.continentdataservice.service.ContinentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class ContinentDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContinentDataServiceApplication.class, args);
    }

    @Bean
    @Transactional
    public CommandLineRunner run(ContinentService continentService) {
        return args -> {
            continentService.fetchAndSaveContinents();
            System.out.println("Continents fetched and saved:");
            continentService.getAllContinents().forEach(System.out::println);
        };
    }
}