package com.home.examples.book.service;

import com.home.examples.book.vo.AuthorVO;

import java.util.List;

public interface AuthorService {

  List<AuthorVO> getAllAuthors();

  AuthorVO getAuthorById(Integer id);

  void createAuthor(AuthorVO authorVO);

  void updateAuthor(AuthorVO authorVO);

  void deleteAuthor(Integer id);

}
