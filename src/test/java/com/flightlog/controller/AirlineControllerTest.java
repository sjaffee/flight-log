package com.flightlog.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineControllerTest {

    @InjectMocks AirlineController airlineController;

    @Test
    public void getAirlines() {
        assertEquals(5, airlineController.getAirlines());
    }
}
