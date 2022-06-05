package com.flightlog.repositories;

import com.flightlog.domain.Airline;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepo extends JpaRepository<Airline, Long> {

}
