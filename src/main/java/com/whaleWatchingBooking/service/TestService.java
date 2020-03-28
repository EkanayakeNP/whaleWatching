package com.whaleWatchingBooking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whaleWatchingBooking.model.Test;
import com.whaleWatchingBooking.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;
	
	public List<Test> getAllTest(){
		
		List<Test> testList = new ArrayList<Test>();
		testRepository.findAll()
		.forEach(testList::add);
		
		return testList;
	}
	
	public void addTest(Test test) {
		testRepository.save(test);
	}
}
