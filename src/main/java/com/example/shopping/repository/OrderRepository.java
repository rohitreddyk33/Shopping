package com.example.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

}
