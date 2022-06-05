package com.flightlog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Aircraft {

    String type;
    String subtype;
    String variant;

}
