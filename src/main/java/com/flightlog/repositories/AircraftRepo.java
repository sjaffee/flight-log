package com.flightlog.repositories;

import com.flightlog.domain.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepo extends JpaRepository<Aircraft, Long> {

}
