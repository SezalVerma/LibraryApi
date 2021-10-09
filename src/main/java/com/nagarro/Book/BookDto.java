

package com.nagarro.Book;

//import java.sql.Date;
//import java.time.LocalDate;

//import javax.validation.constraints.NotBlank;
//import javax.annotation.*;
//import com.nagarro.Author.Author;

public class BookDto {
	

	private int code;
//	@NotBlank(message = "Name is mandatory")
	private String name;
//	@NotBlank(message = "Author is mandatory")
	private String author;
	private String date;
	

	public BookDto() {
		
	}
	public BookDto(int code, String name, String author, String date) {
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
