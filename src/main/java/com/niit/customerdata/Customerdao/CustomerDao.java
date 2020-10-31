package com.niit.customerdata.Customerdao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niit.customerdata.entity.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
}
