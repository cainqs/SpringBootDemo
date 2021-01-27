package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.interfaces.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userSerice = null;

    @RequestMapping("/print")
    @ResponseBody
    public User printUser(String id, String userName, String note){
        User user = new User();
        user.setUserId(id);
        user.setUserName(userName);
        user.setNote(note);

        userSerice.printUser(user);
        return user;
    }
}
