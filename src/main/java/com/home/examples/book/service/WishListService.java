package com.home.examples.book.service;


import com.home.examples.book.vo.WishListVO;

import java.util.List;

public interface WishListService {

  List<WishListVO> getWishList();

  void createWishList(WishListVO wishListVO);

  void deleteWishList(Integer id);
}
