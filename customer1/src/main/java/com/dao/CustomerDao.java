package com.dao;

import java.util.List;

import com.entities.Customer;

public interface CustomerDao {

    public void saveOrUpdate(Customer customer);
     
    public void delete(String email);
     
    public Customer get(String email);
     
    public List<Customer> list();

	void Update(Customer customer);

}
