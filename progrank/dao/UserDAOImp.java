package com.progrank.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.progrank.model.UserRegDTO;
@Repository
public class UserDAOImp  implements UserDAO{
	@Autowired
 JdbcTemplate jdbc;
	
	
	@Override
	public int registerUser(UserRegDTO u) {
		String sql ="insert into tbl_user(user_name,user_email,user_password,country,gender)" + "values(?,?,?,?,?)";
		try {
			
			return jdbc.update(sql, u.getUserName(),u.getUserEmail(),u.getPassword(),u.getCountry(),u.getGender()+"");
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
		}
		
		
		
	}
   
	
}
