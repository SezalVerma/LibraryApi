package com.nagarro.Book;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/books/{code}")
	public Optional<Book> getBook( @PathVariable int code) {
		return bookService.getBook(code);	
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/books")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/books/{code}")
	public void updateBook(@RequestBody Book book , @PathVariable int code) {
		 bookService.updateBook(code, book);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/books/{code}")
	public void deleteBook(@PathVariable int code) {
		bookService.deleteBook(code);
	}

}
