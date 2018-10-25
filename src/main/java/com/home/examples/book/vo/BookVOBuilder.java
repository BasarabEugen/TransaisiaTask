package com.home.examples.book.vo;

public final class BookVOBuilder {
    private Integer id;
    private String title;
    private String isbn;
    private Integer numberOfPages;
    private String edition;
    private String genre;
    private Integer authorId;
    private String author;

    private BookVOBuilder() {
    }

    public static BookVOBuilder aBookVO() {
        return new BookVOBuilder();
    }

    public BookVOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public BookVOBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookVOBuilder withIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookVOBuilder withNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    public BookVOBuilder withEdition(String edition) {
        this.edition = edition;
        return this;
    }

    public BookVOBuilder withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public BookVOBuilder withAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public BookVOBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookVO build() {
        BookVO bookVO = new BookVO();
        bookVO.setId(id);
        bookVO.setTitle(title);
        bookVO.setIsbn(isbn);
        bookVO.setNumberOfPages(numberOfPages);
        bookVO.setEdition(edition);
        bookVO.setGenre(genre);
        bookVO.setAuthorId(authorId);
        bookVO.setAuthor(author);
        return bookVO;
    }
}
