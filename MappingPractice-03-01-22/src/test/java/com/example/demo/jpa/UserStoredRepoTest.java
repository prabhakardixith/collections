package com.example.demo.jpa;

import com.example.demo.model.UserStored;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserStoredRepoTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private UserStoredRepo userStoredRepo;
    @Test
    @Transactional
    void getUserRecordByStoredProcedure() {
       Session session =  this.entityManager.unwrap(Session.class);

        boolean closed = session.isConnected();
        List resultList = session.createQuery("from User").getResultList();
        System.out.println(resultList);
        List<UserStored> list= this.userStoredRepo.getRecordUsingStoredProcedure();
//        list.stream().forEach(u -> System.out.println(u));
//        Integer i [] ={2,4,6,8,1,3,5};
//        Integer sum = Arrays.stream(i).filter(e -> e%2 == 0).mapToInt(m-> m).sum();
//        System.out.println(sum);
//       Long count =  Arrays.stream(i).filter(e -> e%2 != 0).count();
//        System.out.println(count);

        list.stream().map(u -> u.getLname()).distinct().forEach(System.out::println);

        List<Integer> max = List.of(1000,2000,3000,4000);

        Map map = Map.of(1,"prabhakar",2,"uday");
        long count = map.entrySet().stream().count();
        System.out.println(count);


    }

    @Test
    void getRandomRows()
    {
        long count = this.userStoredRepo.countOfValues();
        int limit = (int) (count/2);
        List<UserStored> userByRandomLine = this.userStoredRepo.getUserByRandomLine(limit);
        System.out.println(userByRandomLine);
    }
}