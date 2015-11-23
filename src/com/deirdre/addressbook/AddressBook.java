package com.deirdre.addressbook;

import java.util.HashMap;
import java.util.Scanner;


public class AddressBook {
	String value;
	HashMap<String, Person> addressBook;
	Person person;
	String surname;
	String firstname;
	String address;
	String address1;
	String address2;
	String address3;
	String mobile;
	int answer = 0;

	public AddressBook(){
		addressBook = new HashMap<String,Person>();
	}

	public void deleteAddress(String value){
		addressBook.remove(value);
	}

	public void displayMenu(){

		System.out.println("***   Address Book   ***");
		System.out.println("1. Add Address");
		System.out.println("2. Find Address");
		System.out.println("3. Delete Address");
		System.out.println("4. List all Addresses");
		System.out.println("5. Exit");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		answer = sc.nextInt();
		sc.nextLine();

		switch (answer){
		case 1: enterAddress();
		saveAddress(surname,person);
		displayMenu();
		break;
		case 2: System.out.println("Please enter surname: ");
		value=sc.next();
		try{
			listAddress(value);
			System.out.println(address);
			displayMenu();
		} catch (NullPointerException e){
			System.out.println("No address found.");
			displayMenu();
		}
		break;
		case 3: System.out.println("Please enter surname: ");
		value = sc.next();
		deleteAddress(value);
		System.out.println("Address is deleted from address book.");
		displayMenu();
		break;
		case 4:  listAll();
		displayMenu();
		break;
		case 5: System.exit(0);
		default: System.out.println("Please enter a number between 1 and 5.");
		displayMenu();

		}
	}


	public void enterAddress(){
		Scanner sc = new Scanner(System.in);
		person = new Person();
		System.out.println("Enter firstname: ");
		firstname=sc.next();
		person.setFirstname(firstname);
		System.out.println("Enter surname: ");
		surname=sc.next();
		person.setSurname(surname);
		sc.nextLine();
		System.out.println("Enter address 1: ");
		address1=sc.nextLine();
		person.setAddress_line_1(address1);
		System.out.println();
		System.out.println("Enter address 2: ");
		address2=sc.nextLine();
		person.setAddress_line_2(address2);
		System.out.println();
		System.out.println("Enter address 3");
		address3=sc.nextLine();
		person.setAddress_line_3(address3);
		System.out.println("Enter mobile");
		mobile=sc.next();
		person.setMobile(mobile);


	}

	public String listAddress(String value) {

		address = addressBook.get(value).getFirstname() + "," +
				addressBook.get(value).getSurname() + "," +
				addressBook.get(value).getAddress_line_1() + "," +
				addressBook.get(value).getAddress_line_2() + "," +
				addressBook.get(value).getAddress_line_3() + "," +
				addressBook.get(value).getMobile() + ".";
		return address;
	}

	public void listAll(){
		for (String key: addressBook.keySet()){
			address = addressBook.get(key).getFirstname() + "," +
					addressBook.get(key).getSurname() + "," +
					addressBook.get(key).getAddress_line_1() + "," +
					addressBook.get(key).getAddress_line_2() + "," +
					addressBook.get(key).getAddress_line_3() + "," +
					addressBook.get(key).getMobile() + ".";
			System.out.println(address);

		}

	}

	public void saveAddress(String surname,Person person){

		addressBook.put(surname, person);
	}


}
