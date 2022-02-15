package com.practiceAllModules.practiceallmodules.RestEnds;

import com.practiceAllModules.practiceallmodules.entity.User;
import com.practiceAllModules.practiceallmodules.entity.userRepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class UserRest
{
    @Autowired
    UserRepo userRepo;

    @GetMapping("getAll")
    @Transactional
    List<User> getAllUserRecord()
    {
        List<User> all = userRepo.findAll();
        all.stream().map(m-> m.getAddress())
                .forEach(System.out::println);

        return all;
    }


    @GetMapping("byId/{id}")
    User getUserById(@PathVariable int id)
    {
        User user = userRepo.findById(id).orElse(new User());
        return user;
    }


    @RequestMapping("allSearch/{id}")
    List<User> getAllUserBySearchs(@PathVariable String id)
    {
        return this.userRepo.getAllUserBySearch(id);
    }

}
