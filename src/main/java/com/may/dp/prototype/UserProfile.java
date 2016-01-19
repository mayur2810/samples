package com.may.dp.prototype;

/**
 * A cloneable object
 */
public class UserProfile implements Cloneable {

	private String firstName;
	private String lastName;
	private String gender;
	private String address;
	private String city;
	private String country;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return this.firstName + ","
				+ this.lastName + ","
				+ this.address + ","
				+ this.city + ","
				+ this.country;
	}

}
