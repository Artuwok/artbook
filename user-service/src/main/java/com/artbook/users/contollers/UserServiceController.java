package com.artbook.users.contollers;

import com.artbook.users.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/users/{userId}")
public class UserServiceController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public User getUser(@PathVariable long userId) {
        return new User(1L, "Artem", "Vlasenko");
    }
}
