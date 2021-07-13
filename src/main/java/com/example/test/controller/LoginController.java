package com.example.test.controller;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public String show() {
        return "register";
    }

    @RequestMapping("/")
    public String show1() {
        return "login";
    }

    @RequestMapping("/Cpassword")
    public String show2() {
        return "Cpassword";
    }

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public String login(String name, String password) {
        UserBean userBean = userService.loginIn(name, password);
        if (userBean != null) {
            return "menu";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/registerIn", method = RequestMethod.POST)
    public String register(String name, String password, String tel, String sex) {
        int flag = userService.registIn(name, password, tel, sex);
        if (flag == 1) {
            return "Rsuccess";
        } else {
            return "Rerror";
        }
    }

    @RequestMapping(value = "/CpasswordIn", method = RequestMethod.POST)
    public String Cpassword(String name, String tel, String password) {
        UserBean userbean = userService.CpasswordIn(name, tel);
        int flag = userService.SpasswordIn(name, password);
        if (userbean != null) {
            if (flag == 1) {
                return "Csuccess";
            } else {
                return "Cerror";
            }
        }
    else{
            return "Serror";
        }
    }


}
