package com.home.examples.book.service;

import com.home.examples.book.vo.AuthorVO;
import com.home.examples.book.entity.Author;
import org.springframework.stereotype.Component;

import static com.home.examples.book.entity.builder.AuthorBuilder.anAuthor;
import static com.home.examples.book.vo.AuthorVOBuilder.anAuthorVO;

@Component
public class AuthorConverter {

    AuthorVO toVO(Author author) {

        return anAuthorVO()
                .withId(author.getId())
                .withName(author.getName())
                .withSurname(author.getSurname())
                .build();
    }

    Author fromVO(AuthorVO authorVO) {
        return anAuthor()
                .withName(authorVO.getName())
                .withSurname(authorVO.getSurname())
                .build();
    }
}
