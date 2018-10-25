package com.home.examples.book.service;

import com.home.examples.book.vo.BookVO;

import java.util.List;

public interface BookService {

    List<BookVO> getAllBooks();

    BookVO getBookById(Integer id);

    void deleteBook(Integer id);

    void createBook(BookVO bookVO);

    void updateBook(BookVO bookVO);

}
