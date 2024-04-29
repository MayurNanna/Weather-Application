package com.cyber.success.WeatherApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@RequestMapping("/")
	public String start() {
		return "WeatherForecast";
	}

}
