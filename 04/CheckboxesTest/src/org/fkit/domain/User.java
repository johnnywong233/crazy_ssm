package org.fkit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

// 域对象，实现序列化接口
@Data
@NoArgsConstructor
public class User implements Serializable {
    private List<String> courses;
}
