package org.fkit.domain;

import lombok.Data;

@Data
public class Dept {

    private Integer id;
    private String name;


    public Dept() {
        super();
    }


    public Dept(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
