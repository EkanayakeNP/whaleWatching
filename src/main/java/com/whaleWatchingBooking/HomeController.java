package com.whaleWatchingBooking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/test")
	public String  home() {
		System.out.println("Hi");
		return "Hello whale watching";
	}
}
