package com.home.examples.book.repository;

import com.home.examples.book.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList, Integer> {

}
