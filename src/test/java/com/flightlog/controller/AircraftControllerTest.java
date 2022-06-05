package com.flightlog.controller;

import com.flightlog.domain.Aircraft;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AircraftControllerTest {

    @InjectMocks
    AircraftController airlineController;

    @Test
    public void getAirlines() {
        Iterable<Aircraft> aircrafts = airlineController.getAircrafts();
        assertEquals(5, StreamSupport.stream(aircrafts.spliterator(), false).count());
    }

}
