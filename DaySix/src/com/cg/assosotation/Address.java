package com.cg.assosotation;

public class Address {
	private String streetNo;
	private String sectorNo;
	private String cityName;
	private int pincode;
	public Address(String streetNo, String sectorNo, String cityName, int pincode) {
		super();
		this.streetNo = streetNo;
		this.sectorNo = sectorNo;
		this.cityName = cityName;
		this.pincode = pincode;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getSectorNo() {
		return sectorNo;
	}
	public void setSectorNo(String sectorNo) {
		this.sectorNo = sectorNo;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
  
}
