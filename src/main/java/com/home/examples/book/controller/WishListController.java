package com.home.examples.book.controller;


import com.home.examples.book.service.WishListService;
import com.home.examples.book.vo.WishListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/wishlist")
public class WishListController {

  @Autowired
  private WishListService wishListService;

  @GetMapping()
  public List<WishListVO> getWishList() {
    return wishListService.getWishList();
  }

  @PostMapping
  public void createWishList(@RequestBody WishListVO wishListVO) {

    wishListService.createWishList(wishListVO);
  }

  @DeleteMapping("/{id}")
  public void deleteWishList(@PathVariable Integer id) {

    wishListService.deleteWishList(id);
  }
}
