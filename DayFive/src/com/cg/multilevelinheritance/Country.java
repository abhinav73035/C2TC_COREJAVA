package com.cg.multilevelinheritance;

public class Country {
	private String countryname;
	private String capital;
	
	public Country() {
		//super();
		System.out.println("Create a Country Object");
	}
	
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", capital=" + capital + "]";
	}
}
