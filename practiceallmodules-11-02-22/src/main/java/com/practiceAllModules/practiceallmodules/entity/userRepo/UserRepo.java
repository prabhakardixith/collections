package com.practiceAllModules.practiceallmodules.entity.userRepo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.practiceAllModules.practiceallmodules.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer>
{
    @Override
    @Query("from User u where u.id=?1")
    Optional<User> findById(Integer id);

    //    @Procedure("getallUser")
    @Query(nativeQuery = true,value = "call getalluser()")
    List<User> getAllUser();

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "update user_interview set name = ?2 where uid=?1")
    int updateUserName(int id, String name);

    @Query("from User u where u.address.id = ?1")
    User getUserByAddressId(int i);


    @Query("From User u where u.name LIKE %?1%")
    List<User> getAllUserBySearch(String id);
}
