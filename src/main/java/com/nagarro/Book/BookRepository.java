package com.nagarro.Book;

import org.springframework.data.repository.CrudRepository;

// CrudReository provides with all crud operations for an entity
// <Entity type , primary key type>
public interface BookRepository extends CrudRepository<Book, Integer>{

}
