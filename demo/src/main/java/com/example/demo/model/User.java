package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {
    private String userId;
    private String userName;
    private String note;
}
