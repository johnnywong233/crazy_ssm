package org.fkit.domain;

import java.io.Serializable;

// 域对象，实现序列化接口
public class User implements Serializable {

    private String username;
    private String sex;
    private Integer age;

    public User() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
