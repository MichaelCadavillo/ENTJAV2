package model;

import javax.persistence.*;

@Embeddable
public class Address {

	@Column(name="houseNumber")
	private String houseNumber;
	@Column(name="street")
	private String street;
	@Column(name="city")
	private String city;
	@Column(name="region")
	private String region;
	@Column(name="zip")
	private int zip;
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
}
