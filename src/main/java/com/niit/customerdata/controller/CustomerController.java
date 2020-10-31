package com.niit.customerdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.customerdata.Customerdao.CustomerDaoImpl;
import com.niit.customerdata.entity.Customer;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerController {
	
	@Autowired
	CustomerDaoImpl emp;
	

	@RequestMapping("/allCustomers")
	public ResponseEntity<List<Customer>> allCustomer(){
		
		List<Customer> allEmp;
		allEmp = emp.getAllCustomers();
		return new ResponseEntity<List<Customer>>(allEmp,HttpStatus.OK);
	}
	
	@RequestMapping("/CustomerById/{id}")
	public ResponseEntity<Customer> CustomerById(int id){
		return new ResponseEntity<Customer>(emp.getCustomerById(id),HttpStatus.OK);
	}
	
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer empl) {
		return new ResponseEntity<Customer>(emp.addCustomer(empl),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable int id) {
		emp.deleteCustomer(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
