package com.practiceAllModules.practiceallmodules.entity.userRepo;

import com.practiceAllModules.practiceallmodules.entity.DeptSalaryTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DeptSalRepoTest
{
    Logger log= LoggerFactory.getLogger(DeptSalRepoTest.class);
    @Autowired
    DeptSalRepo deptSalRepo;
    @Test
    void getAllUser()
    {
        log.info("getAllUser() stated");
        List<DeptSalaryTest> all = this.deptSalRepo.findAll();
        all.forEach(System.out::println);
        log.info("getAllUser() ended");
    }

    @Test
    void getDistinctDept()
    {
        long count = this.deptSalRepo.findAll()
                .stream().map(m-> m.getBranch()).distinct()
                .count();
        log.info("Count : "+count);
    }

    @Test
    void getParticularBranchTotalSal()
    {
        Integer babySum = this.deptSalRepo.findAll()
                .stream().filter(v -> v.getBranch().equals("Baby"))
                .map(m -> m.getSalary())
                .reduce((sum, val) -> sum += val)
                .get();
        log.info("sum : "+babySum);
    }

    @Test
    void getAllDeptBySearch()
    {

    }
}