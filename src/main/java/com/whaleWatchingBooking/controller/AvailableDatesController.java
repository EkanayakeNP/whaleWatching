package com.whaleWatchingBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.whaleWatchingBooking.model.AvailableDates;
import com.whaleWatchingBooking.service.AvailableDatesService;

@RestController
public class AvailableDatesController {

	@Autowired
	private AvailableDatesService availableDatesService;
	
	
	@RequestMapping(method=RequestMethod.POST,value="/addAvailableDates")
	public void addAvailableDates(@RequestBody AvailableDates dates) {
		
		availableDatesService.addAvailableDates(dates);
	}
	
	@RequestMapping("/getAllAvailableDates")
	public List<AvailableDates> getAllAvailableList(){
		return availableDatesService.getAllAvailabeDates();
		
	}
	
}
