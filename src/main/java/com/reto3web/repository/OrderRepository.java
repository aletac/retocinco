package com.reto3web.repository;

import com.reto3web.model.Order;
import com.reto3web.repository.crud.OrderCrudRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;


import org.springframework.data.mongodb.core.query.Query;
;


/**
 *
 * @author desarrolloextremo
 */
@Repository
public class OrderRepository {

    @Autowired
    private OrderCrudRepository orderCrudRepository;
    
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Order> getAll() {
        return (List<Order>) orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order) {
        return orderCrudRepository.save(order);
    }

    public void update(Order order) {
        orderCrudRepository.save(order);
    }

    public void delete(Order order) {
        orderCrudRepository.delete(order);
    }

    public Optional<Order> lastUserId() {
        return orderCrudRepository.findTopByOrderByIdDesc();
    }

    public List<Order> findByZone(String zona) {
        return orderCrudRepository.findByZone(zona);
    }

}

