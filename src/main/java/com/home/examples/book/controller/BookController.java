package com.home.examples.book.controller;

import com.home.examples.book.vo.BookVO;
import com.home.examples.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public List<BookVO> getBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookVO getBookById(@PathVariable Integer id) {

        return bookService.getBookById(id);
    }

    @PostMapping
    public void createBook(@RequestBody BookVO bookVO) {

        bookService.createBook(bookVO);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable Integer id, @RequestBody BookVO bookVO) {

        bookVO.setId(id);
        bookService.updateBook(bookVO);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id) {

        bookService.deleteBook(id);
    }
}
