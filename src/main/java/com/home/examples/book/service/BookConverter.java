package com.home.examples.book.service;

import com.home.examples.book.entity.Book;
import com.home.examples.book.repository.AuthorRepository;
import com.home.examples.book.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.home.examples.book.entity.builder.BookBuilder.aBook;
import static com.home.examples.book.vo.BookVOBuilder.aBookVO;

@Component
public class BookConverter {

    @Autowired
    private AuthorRepository authorRepository;

    BookVO toVO(Book book) {

        return aBookVO()
                .withId(book.getId())
                .withTitle(book.getTitle())
                .withEdition(book.getEdition())
                .withGenre(book.getGenre())
                .withIsbn(book.getIsbn())
                .withNumberOfPages(book.getNumberOfPages())
                .withAuthorId(book.getAuthor().getId())
                .withAuthor(book.getAuthor().getName() + " " + book.getAuthor().getSurname())
                .build();
    }

    Book fromVO(BookVO bookVO) {

        return aBook()
                .withTitle(bookVO.getTitle())
                .withGenre(bookVO.getGenre())
                .withEdition(bookVO.getEdition())
                .withIsbn(bookVO.getIsbn())
                .withNumberOfPages(bookVO.getNumberOfPages())
                .withAuthor(authorRepository.getOne(bookVO.getAuthorId()))
                .build();
    }

}
