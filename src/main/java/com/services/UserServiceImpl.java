package com.services;

import com.entity.User;
import com.model.dto.UserDto;
import com.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    private List<User> users;
    public UserServiceImpl(){
        this.users = new ArrayList<>();
        this.users.add(new User(1, "AB", "a.gmail.com", "0919005071", "Avatar1", "110105"));
        this.users.add(new User(2, "BC", "b.gmail.com", "0965271254", "Avatar2", "220496"));
        this.users.add(new User(3, "CD", "c.gmail.com", "0952207859", "Avatar3", "060771"));
    }
    @Override
    public List<UserDto> getListUser() {
        List<UserDto> userDtos = new ArrayList<>();
        for (User user: this.users){
            userDtos.add(UserMapper.toUserDto(user));
        }
        return userDtos;
    }

    @Override
    public UserDto getUserByID(int id) {
        for (User user: this.users){
            if (user.getId() == id){
                return UserMapper.toUserDto(user);
            }
        }
        return null;
    }

    @Override
    public List<UserDto> searchUser(String keyword) {
        List<UserDto> userDtos = new ArrayList<>();
        for (User user : this.users){
            if (user.getName().contains(keyword)){
                userDtos.add(UserMapper.toUserDto(user));
            }
        }
        return userDtos;
    }
}
