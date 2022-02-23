package com.abc.ecom1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.ecom1.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order , Integer> {

}
