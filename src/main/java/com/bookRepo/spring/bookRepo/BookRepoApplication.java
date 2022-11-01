package com.bookRepo.spring.bookRepo;

import com.bookRepo.spring.bookRepo.entity.Book;
import com.bookRepo.spring.bookRepo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class BookRepoApplication implements CommandLineRunner {


    private final BookRepository bookRepository;

    public BookRepoApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookRepoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Book book1 = new Book("Война и мир", "Л.Н. Толстой");
        Book book2 = new Book("Горе от ума", "А.С. Грибоедов");

        bookRepository.save(book1);
        bookRepository.save(book2);


    }
}
