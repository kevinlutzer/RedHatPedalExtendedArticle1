package com.redhat.User.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/api/user/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public void signupSubmit(@RequestBody User serviceUser) {
        userService.createUser(serviceUser);
    }

    @GetMapping("/api/users")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<User>> customers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/api/user/{user_id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<User>> getUser(@PathVariable Long userId) {

        return ResponseEntity.ok(userService.getUserById(userId));
    }
}