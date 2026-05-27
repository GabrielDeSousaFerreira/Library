package com.gabriel.library.config;

import com.gabriel.library.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Order(1)
public class MenuBookList implements CommandLineRunner{
    private final BookRepository bookRepository;

    public MenuBookList(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (bookRepository.count() == 0){
            bookRepository.saveAll(List.of(
                //Add books here
            ));
        }
    }
}
