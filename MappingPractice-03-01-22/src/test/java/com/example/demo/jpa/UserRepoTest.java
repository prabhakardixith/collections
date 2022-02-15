package com.example.demo.jpa;

import com.example.demo.model.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepoTest
{
    Logger logger = LoggerFactory.getLogger(UserRepoTest.class);
    @Autowired
    private UserRepo userRepo;
    @Test
    void getUser()
    {

        logger.info("inside getUser()");
        User user = this.userRepo.findById(1).orElse(new User());
        System.out.println(user);

    }

    @Test
    void addUser()
    {
        logger.info("in addUser()");
        Integer id = this.userRepo
                .save(User.builder()
                        .id(0).fName("sikha").lName("sahu").build()).getId();
        logger.info("Inserted user Id : "+id);
    }
}