package com.practice.demo.rest;

import com.practice.demo.model.User;
import com.practice.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserRest
{
    @Autowired
    private UserService userService;

    @GetMapping("/all/{p}/{s}")
    Page<User> getAllUsers(@PathVariable("p") Integer page,@PathVariable("s") Integer s)
    {
        return this.userService.getAllUsers(page,s);
    }

    @PostMapping("/add")
    User addUser(@RequestBody User user)
    {
        return this.userService.addUser(user);
    }

    @PutMapping("/update")
    User updateUser(@RequestBody User user)
    {
        return this.userService.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    void deleteUserById(@PathVariable("id") Integer id)
    {
         this.userService.deleteUserById(id);
    }



}
