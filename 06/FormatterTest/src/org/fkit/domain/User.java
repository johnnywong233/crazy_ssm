package org.fkit.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

// 域对象，实现序列化接口
@Data
public class User implements Serializable {

    private String loginname;
    private Date birthday;

    public User() {
        super();
    }
}
