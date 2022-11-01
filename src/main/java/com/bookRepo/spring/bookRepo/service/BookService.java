package com.bookRepo.spring.bookRepo.service;

import com.bookRepo.spring.bookRepo.entity.Book;
import com.bookRepo.spring.bookRepo.repository.BookRepository;
import com.bookRepo.spring.bookRepo.util.CustomResponse;
import com.bookRepo.spring.bookRepo.util.CustomStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Slf4j
public class BookService {

    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;

    }


    public CustomResponse<Book> getAll() {
        List<Book> books = bookRepository.findAll();
        return new CustomResponse<>(books, CustomStatus.SUCCESS);

    }

    public CustomResponse<Book> getBookByTitle(String title) {
        Book book = bookRepository.findBookByTitle(title).orElseThrow();
        return new CustomResponse<>(Stream.of(book).collect(Collectors.toList()),
                CustomStatus.SUCCESS);
    }

    public CustomResponse<Book> addBook(Book book) {
        Book newbook = bookRepository.save(book);
        return new CustomResponse<>(Stream.of(newbook).collect(Collectors.toList()),
                CustomStatus.SUCCESS);
    }
}
