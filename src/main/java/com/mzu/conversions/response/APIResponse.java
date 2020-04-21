package com.mzu.conversions.response;

public class APIResponse {
	private long id; 
	private double value;
	private String symbols;
	
	public APIResponse(long id, double value, String symbols) {
		this.value = value;
		this.symbols = symbols;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getSymbols() {
		return symbols;
	}

	public void setSymbols(String symbols) {
		this.symbols = symbols;
	}
		
}
