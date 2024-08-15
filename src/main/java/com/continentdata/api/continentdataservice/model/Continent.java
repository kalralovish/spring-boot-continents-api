package com.continentdata.api.continentdataservice.model;

import javax.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class Continent {
    @Id
    private String code;
    private String name;
    private long areaSqKm;
    private long population;
    
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "continent_lines", joinColumns = @JoinColumn(name = "continent_code"))
    @Column(name = "line")
    private Set<String> lines;
    
    private int countries;
    
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "continent_oceans", joinColumns = @JoinColumn(name = "continent_code"))
    @Column(name = "ocean")
    private Set<String> oceans;
    
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "continent_developed_countries", joinColumns = @JoinColumn(name = "continent_code"))
    @Column(name = "country")
    private Set<String> developedCountries;
}