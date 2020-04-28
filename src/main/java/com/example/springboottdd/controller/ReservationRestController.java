package com.example.springboottdd.controller;

import com.example.springboottdd.entity.Reservation;
import com.example.springboottdd.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
public class ReservationRestController {

    private final ReservationRepository reservationRepository;

    public ReservationRestController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/reservations")
    public Collection<Reservation> getReservations() {
        return reservationRepository.findAll();
    }
}
