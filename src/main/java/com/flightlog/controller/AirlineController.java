package com.flightlog.controller;

import com.flightlog.domain.Aircraft;
import com.flightlog.domain.Airline;
import com.flightlog.repositories.AirlineRepo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@Component
public class AirlineController {

//    @Inject AirlineRepo repo;

    public List<Airline> getAirlines() {
        return Arrays.asList(
                new Airline("Lufthansa", new Aircraft("Airbus", "330", "300")),
                new Airline("Japan Airlines", new Aircraft("Boeing", "787", "9")),
                new Airline("KLM", new Aircraft("Boeing", "777", "300")),
                new Airline("Delta", new Aircraft("Airbus", "350", "900")),
                new Airline("Qatar", new Aircraft("Airbus", "350", "1000")));
    }
}
