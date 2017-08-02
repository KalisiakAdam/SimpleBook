package com.winwinteam.guruspring.springWebApp.repositories;

import com.winwinteam.guruspring.springWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
