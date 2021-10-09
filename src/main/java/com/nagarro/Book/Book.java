package com.nagarro.Book;

//import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

//import com.nagarro.Author.Author;


@Entity
public class Book {
	
//	primary key for entry
	@Id
	private int code;
	private String name;
	private String author;
	private LocalDate date;
	
	public Book() {
		
	}
	public Book(int code, String name, String author , LocalDate date) {
		super();
		this.code = code;
		this.name = name;
		this.author = author;
		this.date = date;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

}
