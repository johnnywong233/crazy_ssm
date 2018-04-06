package org.fkit.domain;

import lombok.Data;

import java.io.Serializable;

// 域对象，实现序列化接口
@Data
public class User implements Serializable {
    private String sex;
}
