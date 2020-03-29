package com.whaleWatchingBooking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whaleWatchingBooking.model.AvailableDates;
import com.whaleWatchingBooking.repository.AvailableDatesRepository;

@Service
public class AvailableDatesService {

	@Autowired
	private AvailableDatesRepository availableDatesRepository;

	public void addAvailableDates(AvailableDates availableDates) {
		availableDatesRepository.save(availableDates);

	}

	public List<AvailableDates> getAllAvailabeDates() {
		List<AvailableDates> availableDatesList = new ArrayList<>();
		availableDatesRepository.findAll().forEach(availableDatesList::add);
		return availableDatesList;
	}
}
