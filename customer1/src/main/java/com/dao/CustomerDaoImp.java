package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entities.Customer;

class UserMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setEmail(rs.getString(1));
		customer.setName(rs.getString(2));
		customer.setAddress(rs.getString(3));
		customer.setGender(rs.getString(4));
		customer.setIncome(rs.getString(5));
		customer.setPassword(rs.getString(6));
		customer.setPhnNum(rs.getString(7));
		return customer;
	}
	
}

public class CustomerDaoImp implements CustomerDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

	@Override
	public void saveOrUpdate(Customer customer) {
		// TODO Auto-generated method stub
		String sql = "insert into customerlist (email,name,password,phnNum ,gender,address,income) values(?,?,?,?,?,?,?)";

        jdbcTemplate.update(sql, new Object[]
        { customer.getEmail(), customer.getName(), customer.getPassword(), customer.getPhnNum(), customer.getGender(),customer.getAddress(), customer.getIncome()});
		
	}
	
	@Override
	public void Update(Customer customer) {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE customerlist SET name=?,password=?,phnNum=? ,gender=?,address=?,income=? WHERE email = ?";

        jdbcTemplate.update(sql, new Object[]
        { customer.getName(), customer.getPassword(), customer.getPhnNum(), customer.getGender(),customer.getAddress(), customer.getIncome(), customer.getEmail()});
		
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		 
		String sql = "DELETE FROM customerlist WHERE email='" + email + "'";
		jdbcTemplate.update(sql);
		System.out.println(email+" profile deleted");
		
	}

	@Override
	public Customer get(String email) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM customerlist where email='" + email + "'";
	    Customer customer = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Customer.class));
		System.out.println("phone nmber:"+ customer.getPhnNum());
	    return customer;
	}

	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		
		String sql = "select * from customerlist";
		
		List<Customer> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
		return list;
	}
	

}
