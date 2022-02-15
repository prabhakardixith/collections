package com.practiceAllModules.practiceallmodules.entity.userRepo;

import com.practiceAllModules.practiceallmodules.entity.Address;
import com.practiceAllModules.practiceallmodules.entity.User;
import net.minidev.json.annotate.JsonIgnore;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepoTest
{
    Logger log = LoggerFactory.getLogger(UserRepoTest.class);
    @Autowired
    private UserRepo userRepo;
    @Test
    public void addUser()
    {
        log.info("begin addUser()");

        Address address = Address.builder()
                .fullAdress("kengeri matha murgod").build();
        User user1 = User.builder()
                .name("shivu")
                .address(address)
                .build();
        int id = this.userRepo.save(user1).getUid();
        log.info("userId : "+id);
        log.info("addUser() end");

    }

    @Test
    void getAllUsers() {
        List<User> allUser = this.userRepo.getAllUser();
        allUser.stream().
                forEach(System.out::println);
//        log.info("all User record : "+allUser);
    }

    @Test
    void updateUserNameById()
    {
        int res = this.userRepo.updateUserName(2, "prabhakar");
        log.info("res : "+res);
        if(res == 1)
        {
            log.info("updated");
        }
        else
        {
            log.info("not update");
        }
    }

    @Test
    void getUserByIdInAddress()
    {
        log.info("getUserById() started");
        User userByAddresId = this.userRepo.getUserByAddressId(1);
        log.info("user : "+userByAddresId);
        log.info("getUserById() ended");
    }

    @Test
    void userByCityCount()
    {
        List<User> allUser = this.userRepo.getAllUser();
        long banglore = allUser.stream().filter(v -> v.getAddress().getCity().equals("banglore"))
                .count();
        log.info("city : "+banglore);
    }

    @Test
    void countIdInDifferentCity()
    {

        Map<Boolean, List<User>> tala = this.userRepo.findAll()
                .stream()
                .collect(Collectors.partitioningBy(v -> v.getAddress().getCity().equals("Tala")));
        System.out.println(tala);

        Map<Boolean, List<User>> tala1 = this.userRepo.findAll().stream()
                .collect(Collectors.groupingBy(u -> u.getAddress().getCity().equals("Tala")));

        System.out.println(tala1);
    }
}