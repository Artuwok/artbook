package com.artbook.users.contollers;

import com.artbook.users.model.User;
import com.artbook.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "v1/users/{userId}")
public class UserServiceController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUser(@PathVariable long userId) {
        final ArrayList<User> users = new ArrayList<>();
       users.add(new User(1l, "ssss", "zzzz"));
        return  users;
    }
}
