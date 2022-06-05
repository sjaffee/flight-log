package com.flightlog.controller;

import com.flightlog.domain.Aircraft;
import com.flightlog.repositories.AircraftRepo;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
public class AircraftController {

    @Inject AircraftRepo aircraftRepo;

    @GetMapping
    public Iterable<Aircraft> getAircrafts() {
        return aircraftRepo.findAll();
    }

    @PostMapping
    public Aircraft saveAircraft(@RequestBody Aircraft aircraft) {
        return aircraftRepo.save(aircraft);
    }

}
