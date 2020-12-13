package com.day0.addressbook;

import java.util.Scanner;

class Contacts  {
	String firstName, lastName, address, city, state;
	long zip, phoneNumber;

	public Contacts(String firstName, String lastName, String address, String city, String state, long zip,
			long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getAddress() {
		return address;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public long getZip() {
		return zip;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	@Override
	public String toString() {
		return " firstName=" + firstName + ",		lastName=" + lastName + ",		address=" + address + ",		city=" + city
				+ ",		state=" + state + ",		zip=" + zip + ",		phoneNumber=" + phoneNumber ;
	}

	

}

//main class
public class AddressBook extends AddressBookOperations  {
	// main method
	static Scanner input = new Scanner(System.in);
   
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook");
		
		 IAddressBookService service=new AddressBookOperations();
		 
		 arraylist.add( new Contacts("purushoth", "kabaddi"," address","chennai", "tamilnadu", 607003, 9488806205l));
		 arraylist.add( new Contacts("babu", "Sail"," address","mumbai", "maharastra", 607007, 9488806205l));
		 arraylist.add( new Contacts("appu", "Jana"," address","bangalore", "karnataka", 607403, 9488806205l));
		 arraylist.add( new Contacts("seetha", "lakshmi"," address","pune", "maharastra", 607083, 9488806205l));
		 arraylist.add( new Contacts("siva", "nantham"," address","kolkata", "west bengal", 607903, 9488806205l));
		 
		while (true) {
			System.out.println(">>>>>>>>CHOOSE THE OPERATION<<<<<<<<<<");
			System.out.println("1.ADD");
			System.out.println("2.EDIT");
			System.out.println("3.DELETE");
			System.out.println("4.SORTBYPERSONNAME");
			System.out.println("5.SORTBYZIP");
			System.out.println("6.SORTBYCITY");
			System.out.println("7.SORTBYSTATE");
			System.out.println("8.DISPLAY INFO");
			System.out.println("9.SEARCH BY CITY");
			System.out.println("-----------------------------------");
			int num = input.nextInt();
			switch (num) {
			case 1:
				service.add();
				break;
			case 2:
				service.edit();
				break;
			case 3:
				service.delete();
				break;
			case 4:
				service.sortbypersonName();
				break;
			case 5:
				service.sortbyzip();
				break;
			case 6:
				service.sortbycity();
				break;
			case 7:
				service.sortbystate();
				break;
			case 8:
				service.displayInfo();
				break;
			case 9:
				service.Searchbycity();
				break;
			default:
				System.out.println("Invalid");
			}
			System.out.println("ANY OTHER OPERATION>>>>: PRESS(0?1)");
			System.out.println("0 -->>YES");
			System.out.println("1 -->> NO");
			int number = input.nextInt();
			if (number == 1)
				break;
		}
		
	}

	
}

