package com.gabriel.library.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_book")
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String resume;
    private double price;

    public Book(String title, String author, String resume, double price) {
        this.title = title;
        this.author = author;
        this.resume = resume;
        this.price = price;
    }

    @ElementCollection(targetClass = Categories.class)
    @CollectionTable(name = "tb_book_category",
            joinColumns = @JoinColumn(name = "book_id")
    )
    @Enumerated(EnumType.STRING)
    private List<Categories> categoriesList = new ArrayList<>();
}
