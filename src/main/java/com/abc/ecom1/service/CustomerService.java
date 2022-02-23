package com.abc.ecom1.service;

import java.util.List;

import com.abc.ecom1.entity.Customer;
import com.abc.ecom1.exception.CustomerNotFoundException;

public interface CustomerService
{
	
	
		public Customer saveCustomer(Customer customer);

		 public List<Customer> getAllCustomers();

		 public Customer getCustomerByid(int customerid);

		 public void deleteCustomer(int customerid);

		 public Customer updateCustomer(Customer customer);

		Customer getCustomerById(int customerId) throws CustomerNotFoundException;

		}

