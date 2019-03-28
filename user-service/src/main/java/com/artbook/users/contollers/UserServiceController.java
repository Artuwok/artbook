package com.artbook.users.contollers;

import com.artbook.users.model.User;
import com.artbook.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "v1/users/")
public class UserServiceController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable long userId) {
        return userService.findUserById(userId);
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }
}
