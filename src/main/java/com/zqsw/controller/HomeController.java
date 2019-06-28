package com.zqsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*****
 *
 * HomeController 
 * @author ：Liye /ZQSW
 * @date ：2019/6/17 15:30
 *  类功能描述 :
 *
 *****/
@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String home(){
        return "home/home";
    }

    @RequestMapping(value="/user")
    public String user(){
        return "home/user";
    }

    @RequestMapping(value="/admin")
    public String admin(){
        return "home/admin";
    }

    @RequestMapping(value="/login")
    public String login(){
        return "home/login";
    }

    @RequestMapping(value="/403")
    public String Error403(){
        return "403";
    }
}
