package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    @Select("SELECT * FROM user WHERE name = #{name} and password=#{password}")
    UserBean getInfo(String name,String password);

@Insert("INSERT INTO user (name,password,tel,sex) VALUES(#{name}," +
        "#{password},#{tel},#{sex})")
    int getInfo1(String name,String password,String tel,String sex);

    @Select("select * from user where name = #{name} and tel=#{tel} ")
    //@Update("UPDATE user SET password = #{password} WHERE name = #{name}")
    //boolean update(UserBean user);
    UserBean getInfo2(String name,String tel);

    @Update("UPDATE user SET password = #{pw1} WHERE name = #{name}")
    int getInfo3(String name,String password);
}
