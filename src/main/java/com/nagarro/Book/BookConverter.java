package com.nagarro.Book;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookConverter {

	public BookDto toBookDto(Book book) {

		BookDto bookDto = new BookDto(book.getCode(), book.getName(), book.getAuthor(),
			book.getDate().toString());
		return bookDto;
	}


	public Book toBook(BookDto bookDto) {
		LocalDate doc = LocalDate.parse(bookDto.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		Book book = new Book(bookDto.getCode(), bookDto.getName(), bookDto.getAuthor(), doc);
		return book;
	}
}

