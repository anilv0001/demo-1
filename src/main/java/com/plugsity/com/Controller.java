package com.plugsity.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/plugisty/avi/v1/")
public class Controller {

	@GetMapping("/saveBusinessUser")
	public String saveBusinessUser() {
		 
		return "hello";
	}
}
