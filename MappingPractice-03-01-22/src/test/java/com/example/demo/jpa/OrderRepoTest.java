package com.example.demo.jpa;

import com.example.demo.model.Order;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderRepoTest
{
    Logger logger = LoggerFactory.getLogger(OrderRepoTest.class);

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    UserRepo userRepo;

    @Test
    void addOrder()
    {
        logger.info("addOrder");
        Integer orderId = this.orderRepo
                .save(Order.builder()
                        .orderId(0)
                        .OrderDate(new Date())
                        .userOrders(List.of(this.userRepo.getById(3),this.userRepo.getById(3))).build()).getOrderId();
        logger.info("OrderId : "+orderId);
    }

    @Test
    void getOrderById()
    {
        logger.info("In getOrderById()");
       Order order =  this.orderRepo.findById(2).orElse(new Order());
       logger.info("order : "+order);
    }
}