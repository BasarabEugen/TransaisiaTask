package com.home.examples.book.entity.builder;

import com.home.examples.book.entity.Author;
import com.home.examples.book.entity.Book;

import java.util.List;

public final class AuthorBuilder {
    private String name;
    private String surname;
    private List<Book> books;

    private AuthorBuilder() {
    }

    public static AuthorBuilder anAuthor() {
        return new AuthorBuilder();
    }

    public AuthorBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AuthorBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public AuthorBuilder withBooks(List<Book> books) {
        this.books = books;
        return this;
    }

    public Author build() {
        Author author = new Author();
        author.setName(name);
        author.setSurname(surname);
        author.setBooks(books);
        return author;
    }
}
