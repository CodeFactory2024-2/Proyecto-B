package com.udea.vueloudea.repository;

import com.udea.vueloudea.model.City;
import com.udea.vueloudea.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IItineraryRepository extends JpaRepository<Flight, Long> {
    List<Flight> findFlightsByOriginAndDestination(City origin, City destination);
}