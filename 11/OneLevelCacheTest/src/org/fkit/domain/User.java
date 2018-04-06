package org.fkit.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
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
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
}
