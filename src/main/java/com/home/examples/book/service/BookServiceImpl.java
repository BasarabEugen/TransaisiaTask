package com.home.examples.book.service;

import com.home.examples.book.entity.Book;
import com.home.examples.book.repository.AuthorRepository;
import com.home.examples.book.repository.BookRepository;
import com.home.examples.book.vo.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookConverter bookConverter;

    @Override
    public List<BookVO> getAllBooks() {

        return bookRepository.findAll().stream()
                .map(book -> bookConverter.toVO(book))
                .collect(Collectors.toList());
    }

    @Override
    public BookVO getBookById(Integer id) {

        return bookConverter.toVO(bookRepository.getOne(id));
    }

    @Override
    public void createBook(BookVO bookVO) {

        bookRepository.save(bookConverter.fromVO(bookVO));
    }

    @Override
    public void updateBook(BookVO bookVO) {

        Book book = bookRepository.getOne(bookVO.getId());

        book.setEdition(bookVO.getEdition());
        book.setTitle(bookVO.getTitle());
        book.setGenre(bookVO.getGenre());
        book.setNumberOfPages(bookVO.getNumberOfPages());
        book.setIsbn(bookVO.getIsbn());
        book.setAuthor(authorRepository.getOne(bookVO.getAuthorId()));

        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Integer id) {

        bookRepository.deleteById(id);
    }
}
