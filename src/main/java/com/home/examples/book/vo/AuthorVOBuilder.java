package com.home.examples.book.vo;

public final class AuthorVOBuilder {
    private Integer id;
    private String name;
    private String surname;

    private AuthorVOBuilder() {
    }

    public static AuthorVOBuilder anAuthorVO() {
        return new AuthorVOBuilder();
    }

    public AuthorVOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public AuthorVOBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AuthorVOBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public AuthorVO build() {
        AuthorVO authorVO = new AuthorVO();
        authorVO.setId(id);
        authorVO.setName(name);
        authorVO.setSurname(surname);
        return authorVO;
    }
}
