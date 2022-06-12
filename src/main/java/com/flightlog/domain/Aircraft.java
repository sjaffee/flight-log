package com.flightlog.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String airline;
    String type;
    String subtype;
    String variant;
    String registration;

    public String getAircraftCode() {
        return this.type.charAt(0) + this.subtype;
    }

}
