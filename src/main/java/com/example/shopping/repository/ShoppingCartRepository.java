package com.example.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopping.entity.ShoppingCart;
@Repository

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Integer> {

}
