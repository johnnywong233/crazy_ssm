package org.fkit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// 域对象，实现序列化接口
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    // 私有字段
    private String username;
    private String sex;
    private Integer age;
}
