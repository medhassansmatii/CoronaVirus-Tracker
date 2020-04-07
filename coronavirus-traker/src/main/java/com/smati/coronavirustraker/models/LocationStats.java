package com.smati.coronavirustraker.models;

public class LocationStats {
	
	private String state;
	private String country;
	private int latesTotalCases;
	private int diffFromPrevDay;
	
	
	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatesTotalCases() {
		return latesTotalCases;
	}
	public void setLatesTotalCases(int latesTotalCases) {
		this.latesTotalCases = latesTotalCases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latesTotalCases=" + latesTotalCases
				+ ", diffFromPrevDay=" + diffFromPrevDay + "]";
	}

	
	

}
