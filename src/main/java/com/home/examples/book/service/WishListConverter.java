package com.home.examples.book.service;

import com.home.examples.book.entity.WishList;
import com.home.examples.book.repository.BookRepository;
import com.home.examples.book.vo.WishListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.home.examples.book.entity.builder.WishListBuilder.aWishList;
import static com.home.examples.book.vo.WishListVOBuilder.aWishListVO;

@Component
public class WishListConverter {
  @Autowired
  private BookRepository bookRepository;

  WishListVO toVO(WishList wishList) {

    return aWishListVO()
            .withId(wishList.getId())
            .withBookId(wishList.getBook().getId())
            .withBookName(wishList.getBook().getTitle())
            .build();
  }

  WishList fromVO(WishListVO wishListVO) {

    return aWishList()
            .withBook(bookRepository.getOne(wishListVO.getBookId()))
            .build();
  }
}
