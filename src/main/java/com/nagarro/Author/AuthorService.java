package com.nagarro.Author;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthorService {
	
//	creates an instance
	@Autowired
	private AuthorRepository authorRepository;
	
	
	public List<Author> getAllAuthors(){

		List<Author> authors = new ArrayList<>();
//		add all entries in list
		authorRepository.findAll().forEach(authors::add);
		return authors;
	}
	
	public  Optional<Author> getAuthor(int id) {	
		
		return authorRepository.findById(id);
	}

	public Author addAuthor(Author author) {
		
		authorRepository.save(author);
		return author;
	}
	
	public void updateAuthor( Author author) {	
		
		authorRepository.save(author);
	}

	public void deleteAuthor(int id) {
		
		authorRepository.deleteById(id);
}
	
}
