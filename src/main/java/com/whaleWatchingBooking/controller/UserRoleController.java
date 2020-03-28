package com.whaleWatchingBooking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.whaleWatchingBooking.model.Test;
import com.whaleWatchingBooking.model.UserRole;
import com.whaleWatchingBooking.service.TestService;
import com.whaleWatchingBooking.service.UserRoleService;

@RestController
public class UserRoleController {
 
	
	  @Autowired 
	  private TestService testService;
	 
	  @Autowired
	  private UserRoleService userRoleService;
	  
	  
	  @RequestMapping(method=RequestMethod.POST,value="/addUserRole")
	  public void addUserRole(@RequestBody UserRole userRole ) {
		  userRoleService.addUserRole(userRole);
		  
	  }
	  
	  
	
	
	/*
	 * @RequestMapping("/test") public void getAllTest(){ List<Test> test = new
	 * ArrayList<Test>(); test = testService.getAllTest();
	 * 
	 * for(Test t:test) {
	 * 
	 * System.out.println("id:"+t.getId()); System.out.println("id:"+t.getName()); }
	 * 
	 * }
	 */
	
	@RequestMapping("/getTest")
	public List<Test> getAllTest()
	{
		return testService.getAllTest();
		 //return Arrays.asList( new Test("s1","Test"));
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addTestData")
	public void addTest(@RequestBody Test test) {
		testService.addTest(test);
	}
	
}
