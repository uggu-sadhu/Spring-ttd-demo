package com.example.springboottdd.entity;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReservationTest {

    @Test
    public void testReservation() {
        Reservation reservation = new Reservation(1L, "Yugandar");
        assertThat(reservation.getId()).isNotNull();
        assertThat(reservation.getId()).isEqualTo(1L);
        assertThat(reservation.getReservationName()).isNotBlank();
        assertThat(reservation.getReservationName()).isEqualTo("Yugandar");
    }
}
