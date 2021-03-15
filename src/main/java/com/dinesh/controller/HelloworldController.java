package com.dinesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@GetMapping(value = "/")
	public String greetings()
	{
		return "Hello World from Scheduler application";
	}
}
