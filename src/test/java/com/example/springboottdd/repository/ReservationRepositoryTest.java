package com.example.springboottdd.repository;

import com.example.springboottdd.entity.Reservation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ReservationRepositoryTest {
    @Autowired
    private ReservationRepository reservationRepository;

    @Test
    public void findByReservationName() {
        this.reservationRepository.save(new Reservation(null, "Vijay"));

        Collection<Reservation> reservations = this.reservationRepository.findByReservationName("Vijay");
        assertThat(reservations.size()).isEqualTo(1);
        assertThat(reservations.iterator().next().getId()).isGreaterThan(0);
        assertThat(reservations.iterator().next().getReservationName()).isEqualTo("Vijay");
    }
}
