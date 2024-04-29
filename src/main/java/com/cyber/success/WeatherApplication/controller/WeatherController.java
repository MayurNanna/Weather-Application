package com.cyber.success.WeatherApplication.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@Controller
public class WeatherController {
	 private final RestTemplate restTemplate;

	    public WeatherController(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

	    @GetMapping("/weather/summary")
	    public ResponseEntity<String> getWeatherSummary(
	            @RequestParam("city") String city){

	        HttpHeaders headers = new HttpHeaders();
	        headers.set("x-rapidapi-key", "b085107b32msh33cf0b0d5ec13f2p134a6cjsnfa35e9e116ef");
	        headers.set("x-rapidapi-host", "forecast9.p.rapidapi.com");
	        HttpEntity<String> entity = new HttpEntity<>(headers);

	        ResponseEntity<String> response = restTemplate.exchange(
	                "https://forecast9.p.rapidapi.com/rapidapi/forecast/"+city+"/summary/",
	                HttpMethod.GET,
	                entity,
	                String.class);

	        return ResponseEntity.ok(response.getBody());
	    }

	    @GetMapping("/weather/hourly/{city}")
	    public ResponseEntity<String> getHourlyWeather(
	            @PathVariable String city,
	            @RequestHeader("x-rapidapi-key") String rapidApiKey,
	            @RequestHeader("x-rapidapi-host") String rapidApiHost) {

	        HttpHeaders headers = new HttpHeaders();
	        headers.set("x-rapidapi-key", rapidApiKey);
	        headers.set("x-rapidapi-host", rapidApiHost);
	        HttpEntity<String> entity = new HttpEntity<>(headers);

	        ResponseEntity<String> response = restTemplate.exchange(
	                "https://wettercom-wettercom-default.p.rapidapi.com/forecast9/v1/location/" + city + "/hourly",
	                HttpMethod.GET,
	                entity,
	                String.class);

	        return ResponseEntity.ok(response.getBody());
	    }

    
}