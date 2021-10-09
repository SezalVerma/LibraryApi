package com.nagarro.Author;

import org.springframework.data.repository.CrudRepository;

// CrudReository provides with all crud operations for an entity
// <Entity type , primary key type>
public interface AuthorRepository extends CrudRepository<Author, Integer>{

}
