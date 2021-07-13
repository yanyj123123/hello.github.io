package com.example.test.serviceImpl;

import com.example.test.bean.UserBean;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {

        return userMapper.getInfo(name,password);
    }
    @Override
    public int registIn(String name,String password,String tel,String sex){
        int flag= userMapper.getInfo1(name,password,tel,sex);
        return flag;
    }
    @Override
    public UserBean CpasswordIn(String name, String tel) {

        return userMapper.getInfo2(name,tel);
    }
    @Override
    public  int SpasswordIn(String name,String password)
    {
        int flag=userMapper.getInfo3(name ,password);
        return flag;
    }
}
