package com.example.springboottdd.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
public class ReservationJpaTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void testJpaMapping() {
        Reservation reservation = this.testEntityManager.persistFlushFind(new Reservation(null, "Vijay"));
        assertThat(reservation.getId()).isNotNull();
        assertThat(reservation.getId()).isGreaterThan(0);
        assertThat(reservation.getReservationName()).isNotBlank();
        assertThat(reservation.getReservationName()).isEqualTo("Vijay");
    }
}
