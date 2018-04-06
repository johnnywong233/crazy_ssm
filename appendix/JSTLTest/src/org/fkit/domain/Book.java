package org.fkit.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {

    private Integer id;
    private String name;
    private String author;

    public Book() {
        super();
    }

    public Book(Integer id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }
}
