package com.home.examples.book;

import com.home.examples.book.entity.Author;
import com.home.examples.book.entity.Book;
import com.home.examples.book.repository.AuthorRepository;
import com.home.examples.book.repository.BookRepository;
import com.home.examples.book.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import static com.home.examples.book.entity.builder.AuthorBuilder.anAuthor;
import static com.home.examples.book.entity.builder.BookBuilder.aBook;
import static com.home.examples.book.entity.builder.WishListBuilder.aWishList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private WishListRepository wishListRepository;

    public void run(ApplicationArguments args) {

        Author levTolstoi = authorRepository.save(anAuthor()
                .withName("Lev")
                .withSurname("Tolstoi")
                .build());

        Author markTven = authorRepository.save(anAuthor()
                .withName("Mark")
                .withSurname("Twain")
                .build());

        Book book1 = bookRepository.save(aBook()
                .withAuthor(levTolstoi)
                .withTitle("Anna Karenina")
                .withIsbn("978-5-699-14342-9")
                .withEdition("Eksmo")
                .withNumberOfPages(960)
                .withGenre("Novel")
                .build());

        Book book2 = bookRepository.save(aBook()
                .withAuthor(levTolstoi)
                .withTitle("War and Peace")
                .withIsbn("978-5-389-06256-6")
                .withEdition("Alphabet")
                .withNumberOfPages(1504)
                .withGenre("Drama")
                .build());

        Book book3 = bookRepository.save(aBook()
                .withAuthor(markTven)
                .withTitle("The Adventures of Tom Sawyer")
                .withIsbn("978-0-00-742011-7")
                .withEdition("Harper")
                .withNumberOfPages(276)
                .withGenre("Children's literature")
                .build());

        wishListRepository.save(aWishList()
                .withBook(book1)
                .build());

        wishListRepository.save(aWishList()
                .withBook(book2)
                .build());
    }
}
