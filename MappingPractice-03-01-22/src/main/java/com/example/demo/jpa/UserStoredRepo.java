package com.example.demo.jpa;

import com.example.demo.model.UserStored;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserStoredRepo extends JpaRepository<UserStored,String>
{
    @Procedure(procedureName = "storeProcedure")
    List<UserStored> getRecordUsingStoredProcedure();

//    @Procedure("counts")
    @Query(nativeQuery = true,value = "select count(fname) from user")
    long countOfValues();

    @Query(nativeQuery = true,value = "select * from user order by rand() limit ?1")
    List<UserStored> getUserByRandomLine(long limit);
}
