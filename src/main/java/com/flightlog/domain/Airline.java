package com.flightlog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Airline {

    String airline;
    Aircraft aircraft;
}
