package com.winwinteam.guruspring.springWebApp.repositories;

import com.winwinteam.guruspring.springWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
