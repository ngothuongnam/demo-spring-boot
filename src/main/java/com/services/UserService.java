package com.services;

import com.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface UserService {
    public List<UserDto> getListUser();
    public UserDto getUserByID(int id) throws SQLException;
    public List<UserDto> searchUser(String keyword);
}
