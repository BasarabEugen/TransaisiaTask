package com.home.examples.book.vo;

/**
 * basar
 * 24.10.2018
 * book
 */
public final class WishListVOBuilder {
  private Integer id;
  private Integer bookId;
  private String bookName;

  private WishListVOBuilder() {
  }

  public static WishListVOBuilder aWishListVO() {
    return new WishListVOBuilder();
  }

  public WishListVOBuilder withId(Integer id) {
    this.id = id;
    return this;
  }

  public WishListVOBuilder withBookId(Integer bookId) {
    this.bookId = bookId;
    return this;
  }

  public WishListVOBuilder withBookName(String bookName) {
    this.bookName = bookName;
    return this;
  }

  public WishListVO build() {
    WishListVO wishListVO = new WishListVO();
    wishListVO.setId(id);
    wishListVO.setBookId(bookId);
    wishListVO.setBookName(bookName);
    return wishListVO;
  }
}
