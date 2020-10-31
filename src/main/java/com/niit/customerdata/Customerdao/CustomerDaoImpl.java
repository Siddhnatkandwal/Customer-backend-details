package com.niit.customerdata.Customerdao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.customerdata.entity.Customer;

@Repository
@Transactional
public class CustomerDaoImpl {

	@Autowired
	CustomerDao emp;

	public List<Customer> getAllCustomers() {
		return emp.findAll();
	}

	public Customer getCustomerById(int id) {
		return emp.findById(id).orElse(null);
	}

	public Customer addCustomer(Customer empl) {
		return emp.save(empl);
	}

	public void deleteCustomer(int id) {
		emp.deleteById(id);
	}

}
