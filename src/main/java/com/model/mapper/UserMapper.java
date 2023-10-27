package com.model.mapper;

import com.entity.User;
import com.model.dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user){
        UserDto tmp = new UserDto();
        return tmp;
    }
}
