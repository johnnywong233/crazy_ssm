package org.fkit.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * CREATE TABLE `tb_user` (
 * `id` INT(11) NOT NULL AUTO_INCREMENT,
 * `name` VARCHAR(18) DEFAULT NULL,
 * `sex` CHAR(2) DEFAULT NULL,
 * `age` INT(11) DEFAULT NULL,
 * PRIMARY KEY  (`id`)
 * )
 */
@Data
public class User implements Serializable {
    // 用户标识
    private Integer id;
    // 用户姓名
    private String name;
    // 用户性别
    private String sex;
    // 用户年龄
    private Integer age;

    // 无参数构造器
    public User() {
        super();
    }

    // 有参数构造器
    public User(String name, String sex, Integer age) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}