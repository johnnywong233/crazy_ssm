package org.fkit.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

// 域对象，实现序列化接口
public class User implements Serializable {

    private String username;
    private MultipartFile image;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }


}
