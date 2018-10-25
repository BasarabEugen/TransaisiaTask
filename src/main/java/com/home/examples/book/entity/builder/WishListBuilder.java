package com.home.examples.book.entity.builder;

import com.home.examples.book.entity.Book;
import com.home.examples.book.entity.WishList;

public final class WishListBuilder {
    private Integer id;
    private Book book;

    private WishListBuilder() {
    }

    public static WishListBuilder aWishList() {
        return new WishListBuilder();
    }

    public WishListBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public WishListBuilder withBook(Book book) {
        this.book = book;
        return this;
    }

    public WishList build() {
        WishList wishList = new WishList();
        wishList.setId(id);
        wishList.setBook(book);
        return wishList;
    }
}
