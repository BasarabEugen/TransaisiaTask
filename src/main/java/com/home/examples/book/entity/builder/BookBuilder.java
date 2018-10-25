package com.home.examples.book.entity.builder;

import com.home.examples.book.entity.Author;
import com.home.examples.book.entity.Book;
import com.home.examples.book.entity.WishList;

public final class BookBuilder {
    private String title;
    private String isbn;
    private Integer numberOfPages;
    private String edition;
    private String genre;
    private Author author;

    private BookBuilder() {
    }

    public static BookBuilder aBook() {
        return new BookBuilder();
    }

    public BookBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder withIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookBuilder withNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    public BookBuilder withEdition(String edition) {
        this.edition = edition;
        return this;
    }

    public BookBuilder withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public BookBuilder withAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Book build() {
        Book book = new Book();
        book.setTitle(title);
        book.setIsbn(isbn);
        book.setNumberOfPages(numberOfPages);
        book.setEdition(edition);
        book.setGenre(genre);
        book.setAuthor(author);
        return book;
    }
}
