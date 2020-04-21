package com.mzu.conversions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;
import com.mzu.conversions.response.APIResponse;
import com.mzu.conversions.services.ConversionServices;

@RestController
@RequestMapping("conversions")
public class ConversionsControllers {
	private AtomicLong counter = new AtomicLong();
	private ConversionServices conversionServices;
		
	@Autowired
	public ConversionsControllers (ConversionServices conversionServices) {
		this.conversionServices = conversionServices;
	}
	
	@GetMapping("/ktoc")
	public APIResponse getkelivnToCelsius(@RequestParam(value = "kelvin", defaultValue="0") double kelvin) {
		return new APIResponse(counter.incrementAndGet(), conversionServices.kelivnToCelsius(kelvin), "degress C");
	}

	@GetMapping("/ctok")
	public APIResponse getCelciusToKelivn(@RequestParam(value = "celsius",  defaultValue="10") double celsius) {
		return new APIResponse(counter.incrementAndGet(), conversionServices.celciusToKelivn(celsius), "K");
	}

	@GetMapping("/mtok")
	public APIResponse getMilesToKilometers(@RequestParam(value = "miles",  defaultValue="1") double miles) {
		return new APIResponse(counter.incrementAndGet(), conversionServices.milesToKilometers(miles), "kilemeters");
	}

	@GetMapping("/ktom")
	public APIResponse getKiloMetersToMiles(@RequestParam(value = "kilometers",  defaultValue="1") double kilometers) {
		return new APIResponse(counter.incrementAndGet(), conversionServices.kelivnToCelsius(kilometers), "miles");
	}
}
