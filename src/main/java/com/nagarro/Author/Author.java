package com.nagarro.Author;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Author {
	
//	primary key for entry
	@Id
	private int id;
	private String firstName;
	private String lastName;
	
	public Author() {
		
	}

	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getListName() {
		return lastName;
	}

	public void setListName(String listName) {
		this.lastName = listName;
	}

	
}
