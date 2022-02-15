package com.practice.demo.service;

import com.practice.demo.model.User;
import com.practice.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@CacheConfig
public class UserService
{
    @Autowired
    private UserRepo userRepo;


    @Cacheable(value = "User",sync = true)
    public Page<User> getAllUsers(Integer page,Integer s )
    {
        Pageable pageable1 = PageRequest.of(page,s);
        Page<User> allUsers = this.userRepo.findAll(pageable1);
        allUsers.stream().forEach(u -> System.out.println(u.getUsername()+" "+u.getMobile()));
        return allUsers;
    }

    @CachePut(value = "user")
    public User addUser(User user)
    {
        return this.userRepo.saveAndFlush(user);
    }

    @CacheEvict(value="user",allEntries = true)
    public void deleteUserById(Integer id)
    {
        this.userRepo.deleteById(id);
    }
}
