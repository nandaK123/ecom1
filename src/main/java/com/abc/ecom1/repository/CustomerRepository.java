package com.abc.ecom1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.ecom1.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>
{

}
