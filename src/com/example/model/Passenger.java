package com.example.model;

public class Passenger {
 private String name;
 private String passportNumber;
 private String contactDetails;
 
 	public Passenger(String name, String passportNumber, String contactDetails) {
 		super();
 		this.name = name;
 		this.passportNumber = passportNumber;
 		this.contactDetails = contactDetails;
 	}

 	public String getName() {
 		return name;
 	}

 	public String getPassportNumber() {
 		return passportNumber;
 	}

 	public String getContactDetails() {
 		return contactDetails;
 	}

 	public void setName(String name) {
 		this.name = name;
 	}

 	public void setPassportNumber(String passportNumber) {
 		this.passportNumber = passportNumber;
 	}

 	public void setContactDetails(String contactDetails) {
 		this.contactDetails = contactDetails;
 	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", passportNumber=" + passportNumber + ", contactDetails=" + contactDetails
				+ "]";
	}

}
