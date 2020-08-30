package com.example.ostore.controller;

import com.example.ostore.db.UserRepository;
import com.example.ostore.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"http://localhost:4200"}
)
@RequestMapping(
        path = {"/users"}
)
public class UserController {
    @Autowired
    private UserRepository userRepository;

    public UserController() {
    }

    @GetMapping({"/get"})
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    @PostMapping({"/add"})
    public void createUser(@RequestBody User user) {
        this.userRepository.save(user);
    }

    @DeleteMapping(
            path = {"/{id}"}
    )
    public User deleteUser(@PathVariable("id") long id) {
        User user = (User)this.userRepository.getOne(id);
        this.userRepository.deleteById(id);
        return user;
    }
}
