package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        System.out.println(id);
        return null;
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
