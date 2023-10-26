package com.service;

import com.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    @Override
    public List<User> getListUser() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "A", "gmail.com", "0919005071", "Avatar", "110105"));
        users.add(new User(2, "B", "gmail.com", "0965271254", "Avatar", "220496"));
        return users;
    }
}
