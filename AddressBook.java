package com.day0.addressbook;
class Contacts {
	String firstName, lastName, address, city, state;
	long zip, phoneNumber;
	int id;

	public Contacts( String firstName, String lastName, String address, String city, String state, long zip,
			long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
}
//main class
public class AddressBook {
     //main method
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook");
	}

}
