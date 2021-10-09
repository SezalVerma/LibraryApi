package com.nagarro.Book;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
	
//	creates an instance
	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks(){
		
		List<Book> books = new ArrayList<>();
//		add all entries in books
		bookRepository.findAll().forEach(books::add);
		return books;
	}
	
	public  Optional<Book> getBook(int code) {
		
		return bookRepository.findById(code);
	}

	public Book addBook(Book book) {

		
		bookRepository.save(book);
		return book;
	}
	
	public void updateBook(int code , Book book) {

		bookRepository.save(book);
	}

	public void deleteBook(int code) {
		
		bookRepository.deleteById(code);
}
	
}
