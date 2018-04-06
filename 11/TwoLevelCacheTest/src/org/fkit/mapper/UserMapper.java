package org.fkit.mapper;

import org.fkit.domain.User;

import java.util.List;

public interface UserMapper {

    // 根据id查询User
    User selectUserById(Integer id);

    // 查询所有User
    List<User> selectAllUser();

    // 根据id删除User
    void deleteUserById(Integer id);

}
