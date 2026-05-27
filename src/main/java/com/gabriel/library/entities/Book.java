package com.gabriel.library.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Book {
    private Long id;
    private String title;
    private String resume;
    private double price;

    @Enumerated(EnumType.STRING)
    private Categories categories;

    public Book(Long id, String title, String resume, double price, Categories categories) {
        this.id = id;
        this.title = title;
        this.resume = resume;
        this.price = price;
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}
