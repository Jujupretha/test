package com.springcrud.repository;
import org.springframework.data.repository.CrudRepository;

import com.springcrud.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
