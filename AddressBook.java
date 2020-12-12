package com.day0.addressbook;

import java.util.ArrayList;
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
		return " firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}

	

}

//main class
public class AddressBook extends Sorting {
	// main method
	static ArrayList<Contacts> arraylist = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	//static HashMap<String, Contacts> hashmap = new HashMap<String, Contacts>();

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook");
		while (true) {
			System.out.println("choose the operation which you want to perform");
			System.out.println("1.ADD");
			System.out.println("2.EDIT");
			System.out.println("3.DELETE");
			System.out.println("4.SORTBYPERSONNAME");
			System.out.println("5.SORTBYZIP");
			System.out.println("6.SORTBYCITY");
			System.out.println("7.SORTBYSTATE");
			System.out.println("8.DISPLAY INFO");
			System.out.println("-----------------------------------");
			int num = input.nextInt();
			switch (num) {
			case 1:
				add();
				break;
			case 2:
				edit();
				break;
			case 3:
				delete();
				break;
			case 4:
				Sorting.sortbypersonName();
				break;
			case 5:
				Sorting.sortbyzip();
				break;
			case 6:
				Sorting.sortbycity();
				break;
			case 7:
				Sorting.sortbystate();
				break;
			case 8:
				displayInfo();
				break;
			default:
				System.out.println("Invalid");
			}
			System.out.println("Do you want to perform any other operations: press(1?0)");
			System.out.println("0 for continue and 1 for stop");
			int number = input.nextInt();
			if (number == 1)
				break;
		}
		
	}

	public static void add() {
		
		System.out.println("enter firstname");
		String firstName = input.next();
		for (Contacts au:arraylist) {
			if (au.firstName.equals(firstName)) {
				System.out.println("Duplicate entry");
				return;
			}
		}
		
		System.out.println("enter lastname");
		String lastName = input.next();
		System.out.println("enter address");
		String address = input.next();
		System.out.println("enter city");
		String city = input.next();
		System.out.println("enter state");
		String state = input.next();
		System.out.println("enter zip");
		long zip = input.nextLong();
		System.out.println("enter phone number");
		long phoneNumber = input.nextLong();
        arraylist.add( new Contacts(firstName, lastName, address, city, state, zip, phoneNumber));
        System.out.println("*****ADDED SUCCESSFULLY*******");  
		}

	public static void edit() {
		boolean flag=false;
		System.out.println("ENTER THE FIRSTNAME WHICH YOU WANT TO EDIT");
		System.out.println("enter firstname");
		String firstName = input.next();
		for (Contacts au:arraylist) {
			if (au.firstName.equals(firstName)) {
			   flag=true;
			   arraylist.remove(au);
				break;
			}
		}
		if(flag==true) {
		System.out.println("enter lastname");
		String lastName = input.next();
		System.out.println("enter address");
		String address = input.next();
		System.out.println("enter city");
		String city = input.next();
		System.out.println("enter state");
		String state = input.next();
		System.out.println("enter zip");
		long zip = input.nextLong();
		System.out.println("enter phone number");
		long phoneNumber = input.nextLong();
		arraylist.add( new Contacts(firstName, lastName, address, city, state, zip, phoneNumber));
		System.out.println("******EDITED SUCCESSFULLY*******");
		}
		else {
			System.out.println("no records found");
		}

	}

	public static void delete() {
		System.out.println("enter the firstname to delete");
		boolean flag=false;
		String firstName = input.next();
		for (Contacts au:arraylist) {
			if (au.firstName.equals(firstName)) {
			   arraylist.remove(au);
			   System.out.println("DELETED SUCCESSFULLY");
			   flag=true;
				return;
			}
		
		}
	    if(flag==false)
	    	System.out.println("NO RECORDS FOUND TO DELETE");
		
		
	}
   
	


	public static void displayInfo() {
		for(Contacts au:arraylist) {
			System.out.println(au);
		}
		
	}
	public static void searchbycity() {
		String city = input.next();
		boolean flag=false;
		for (Contacts au:arraylist) {
			if (au.city.equals(city)) {
			   System.out.println(au);
			   flag=true;
			}
		
		}
		if(flag==false)
			System.out.println("NO RECORDS FOUND");
		
	}
}
	