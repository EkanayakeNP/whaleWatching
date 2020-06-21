package com.whaleWatchingBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.whaleWatchingBooking.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

}
