package com.controller;

import com.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

/*
MVC:
    View: JSP
    Controller: Servlet: Tiep nhan request
    Model: Class, DAOclass: Xu ly logic, tuong tac voi DB

3 layer:
    Controller: Tiep nhan request
    Service: Xu ly logic
    Repository: Tuong tac voi DB
Phan view co the dung JSP hoac tach khoi project spring boot va dung reactjs
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getListUser() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getListUser());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) throws SQLException {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserByID(id));
    }
    @GetMapping("/search")
    public ResponseEntity<?> searchUser(@RequestParam(required = false, defaultValue = "") String keyword) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.searchUser(keyword));
    }

    @PostMapping("")
    public ResponseEntity<?> createUser() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser() {
        return null;
    }
}
