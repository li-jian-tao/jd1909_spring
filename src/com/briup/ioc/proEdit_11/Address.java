package com.briup.ioc.proEdit_11;

public class Address {
	private String city;
	private String street;
	private String country;
	
	public Address(){
		
	}
	public Address(String city, String street, String country) {
		this.city = city;
		this.street = street;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString(){
		return super.toString()+  " city="+city+" street="+street+" country="+country;
	}
}
