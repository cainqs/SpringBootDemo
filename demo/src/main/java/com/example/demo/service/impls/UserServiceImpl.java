package com.example.demo.service.impls;

import com.example.demo.model.User;
import com.example.demo.service.interfaces.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void printUser(User user) {
        // TODO Auto-generated method stub
        if(null == user){
            throw new RuntimeException("User is null");
        }

        System.out.println("userId = " + user.getUserId());
        System.out.println("userName = " + user.getUserName());
        System.out.println("note = " + user.getNote());
    }
    
}
