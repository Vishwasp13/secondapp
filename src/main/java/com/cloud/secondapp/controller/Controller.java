package com.cloud.secondapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(value="/hi")
	public String sayHi() {
		return "Hi";
	}
}