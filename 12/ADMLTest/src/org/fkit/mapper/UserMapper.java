package org.fkit.mapper;

import org.apache.ibatis.annotations.*;
import org.fkit.domain.User;

import java.util.List;

public interface UserMapper {

    @Insert("INSERT INTO TB_USER(name,sex,age) VALUES(#{name},#{sex},#{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
//	@SelectKey(before=false,keyProperty="id",resultType=Integer.class,
//	statement="SELECT LAST_INSERT_ID() AS id")
    int saveUser(User user);

    @Delete("DELETE FROM TB_USER WHERE id = #{id}")
    int removeUser(@Param("id") Integer id);

    @Update("UPDATE TB_USER SET name = #{name},sex = #{sex},age = #{age} WHERE id = #{id}")
    void modifyUser(User user);

    @Select("SELECT * FROM TB_USER WHERE id = #{id}")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "sex", property = "sex"),
            @Result(column = "age", property = "age")
    })
    User selectUserById(@Param("id") Integer id);

    @Select("SELECT * FROM TB_USER ")
    List<User> selectAllUser();

}
