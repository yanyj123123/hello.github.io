package com.example.test.service;

import com.example.test.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name,String password);

    public int registIn(String name,String password,String tel,String sex);

    UserBean CpasswordIn(String name,String tel);

    public int SpasswordIn(String name,String password);
}
