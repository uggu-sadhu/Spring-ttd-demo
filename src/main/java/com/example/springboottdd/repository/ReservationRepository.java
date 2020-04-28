package com.example.springboottdd.repository;

import com.example.springboottdd.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Collection<Reservation> findByReservationName(String name);
}
