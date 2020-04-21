package com.mzu.conversions.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConversionServicesImpl implements ConversionServices {
	
	private static final double CONVERSION_CONST_ONE_KILOMETERS = 1.609;
	private static final double CONVERSION_CONST = 273.15;
	
	@Override
	public double kelivnToCelsius(double kelvin) {
		return (kelvin - CONVERSION_CONST);
	}

	@Override
	public double celciusToKelivn(double celsius) {
		return (celsius + CONVERSION_CONST);
	}

	@Override
	public double milesToKilometers(double miles) {
		return (miles * CONVERSION_CONST_ONE_KILOMETERS);
	}

	@Override
	public double kiloMetersToMiles(double kilometers) {
		return (kilometers / CONVERSION_CONST_ONE_KILOMETERS);
	}

}
