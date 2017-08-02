package com.winwinteam.guruspring.springWebApp.bootstrap;


import com.winwinteam.guruspring.springWebApp.model.Author;
import com.winwinteam.guruspring.springWebApp.model.Book;

import com.winwinteam.guruspring.springWebApp.model.Publisher;
import com.winwinteam.guruspring.springWebApp.repositories.AuthorRepository;
import com.winwinteam.guruspring.springWebApp.repositories.BookRepository;
import com.winwinteam.guruspring.springWebApp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;

    private BookRepository bookRepository;

    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData(){
        //Adam
        Publisher pwn = new Publisher();
        pwn.setPublisherName("PWN");
        publisherRepository.save(pwn);

        Publisher pearson = new Publisher();
        pearson.setPublisherName("PEARSON");
        publisherRepository.save(pearson);

        Author adam = new Author("Adam","Dadam");
        Book ddd = new Book("Design Patterns","2345",pwn);

        adam.getBooks().add(ddd);
        ddd.getAuthors().add(adam);


        authorRepository.save(adam);
        bookRepository.save(ddd);



        //Ula
        Author ula = new Author("Ula","Alu");
        Book df = new Book("Design Furniture","9876",pearson);

        ula.getBooks().add(df);
        df.getAuthors().add(ula);


        authorRepository.save(ula);
        bookRepository.save(df);


    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
