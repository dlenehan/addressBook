package com.deirdre.addressbook;

import java.util.HashMap;
public class NameKey {
	
	private HashMap<String, Person> addressBook = new HashMap<String,Person>();
	private String name;
	private Person person;
	
	public NameKey()
	{
		person.setFirstname("Dee");
		person.setSurname("Lenehan");
		person.setAddress_line_1("20 Ardagh Park Road");
		person.setAddress_line_2("Blackrock");
		person.setAddress_line_3("Co. Dublin");
		person.setMobile("0877601406");
		addressBook.put("Deirdre",person);
		
	}

	public void enterContact(String name, Person person){
		addressBook.put(name, person);
		
	}
	
	
}

