package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.StaffModel;

@Repository
public class StaffRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addStaff(StaffModel staffModel){
		System.out.println("EXCUTE INSERT MEMBER");
	  jdbcTemplate.update("INSERT INTO User (UserId, PhoneNumber, Password, UserName, RegistrationTime, LastLoginTime)"
	  		+ "VALUES ()",staffModel.getUserId(), staffModel.getPhoneNumber(),
	  		staffModel.getPassword(),staffModel.getUserName(),staffModel.getRegistrationTime(),staffModel.getLastLoginTime());
  }


}