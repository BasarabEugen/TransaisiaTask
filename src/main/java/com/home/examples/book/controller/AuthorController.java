package com.home.examples.book.controller;

import com.home.examples.book.vo.AuthorVO;
import com.home.examples.book.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping()
    public List<AuthorVO> getAuthros() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public AuthorVO getAuthorById(@PathVariable Integer id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public void createAuthor(@RequestBody AuthorVO authorVO) {

        authorService.createAuthor(authorVO);
    }

    @PutMapping("/{id}")
    public void updateAuthor(@PathVariable Integer id, @RequestBody AuthorVO authorVO) {

        authorVO.setId(id);
        authorService.updateAuthor(authorVO);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Integer id) {

        authorService.deleteAuthor(id);
    }

}
