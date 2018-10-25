package com.home.examples.book.service;

import com.home.examples.book.repository.WishListRepository;
import com.home.examples.book.vo.WishListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WishListServiceImpl implements WishListService {
  @Autowired
  private WishListRepository wishListRepository;

  @Autowired
  private WishListConverter wishListConverter;

  @Override
  public List<WishListVO> getWishList() {
    return wishListRepository.findAll().stream()
            .map(wishList -> wishListConverter.toVO(wishList))
            .collect(Collectors.toList());
  }

  @Override
  public void createWishList(WishListVO wishListVO) {
    wishListRepository.save(wishListConverter.fromVO(wishListVO));
  }

  @Override
  public void deleteWishList(Integer id) {
    wishListRepository.deleteById(id);
  }
}
