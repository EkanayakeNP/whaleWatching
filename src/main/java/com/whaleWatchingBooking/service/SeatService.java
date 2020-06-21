package com.whaleWatchingBooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whaleWatchingBooking.model.Seat;
import com.whaleWatchingBooking.repository.SeatRepository;

@Service
public class SeatService {

	@Autowired
	private SeatRepository seatRepository;
	
	
	public void addSeat(Seat seat) {
		seatRepository.save(seat);
	}
	
	public List<Seat>getAllSeat(){
		return seatRepository.findAll();
	}
	
	public Optional<Seat> getSeat(Long id){
		return seatRepository.findById(id);
	}
	
	public void deleteSeat(Long id) {
		 seatRepository.deleteById(id);
	}
	
}
