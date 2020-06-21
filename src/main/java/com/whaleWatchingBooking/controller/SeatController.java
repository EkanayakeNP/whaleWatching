package com.whaleWatchingBooking.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.whaleWatchingBooking.model.Seat;
import com.whaleWatchingBooking.service.SeatService;

@RestController
public class SeatController {

	@Autowired
	private SeatService service;
	
	@PostMapping("/addSeat")
	public String addSeat(@RequestBody Seat seat) {
		
		service.addSeat(seat);
		return "succesfully saved";
		
	}
	
	@GetMapping("/seats")
	public List<Seat> getAllSeats(){
		return service.getAllSeat();
		
	}
	
	@GetMapping("/seat/{id}")
	public Optional<Seat> getSeats(@PathVariable Long id){
		Optional<Seat> returnSeat = service.getSeat(id);
		if(returnSeat==null)
			throw new NoResultException();
		else{
			return returnSeat;
		}
	}
	
	@PutMapping("/seat/{id}")
	public Seat changeSeat(@RequestBody Seat seat,@PathVariable Long id) {
		Seat findSeat = null;
		Optional<Seat> changedSeat = service.getSeat(id);
		if(changedSeat.isPresent()) {
			//findSeat = changedSeat.get();
			changedSeat.get().setModDate(seat.getModDate());
			changedSeat.get().setModUser(seat.getModUser());
			changedSeat.get().setNoOfSeat(seat.getNoOfSeat());
			service.addSeat(changedSeat.get());
		}
		
		return findSeat;
	}
	
	@DeleteMapping("seat/{id}")
	public String deleteSeat(@PathVariable Long id){
		Optional<Seat> existingSeat = service.getSeat(id);
		if(existingSeat.isPresent()) {
			service.deleteSeat(id);
			
		}
		return "Deleted";
	}
}
