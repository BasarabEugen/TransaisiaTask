package com.home.examples.book.service;

import com.home.examples.book.entity.Author;
import com.home.examples.book.vo.AuthorVO;
import com.home.examples.book.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorConverter authorConverter;

    @Override
    public List<AuthorVO> getAllAuthors() {

        return authorRepository.findAll().stream()
                .map(author -> authorConverter.toVO(author))
                .collect(Collectors.toList());
    }

    @Override
    public AuthorVO getAuthorById(Integer id) {
        return authorConverter.toVO(authorRepository.getOne(id));
    }

    @Override
    public void createAuthor(AuthorVO authorVO) {
        authorRepository.save(authorConverter.fromVO(authorVO));
    }

    @Override
    public void updateAuthor(AuthorVO authorVO) {
        Author author = authorRepository.getOne(authorVO.getId());

        author.setName(authorVO.getName());
        author.setSurname(authorVO.getSurname());
        authorRepository.save(author);

    }

    @Override
    public void deleteAuthor(Integer id) {
        authorRepository.deleteById(id);
    }
}
