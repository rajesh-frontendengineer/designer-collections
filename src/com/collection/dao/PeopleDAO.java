package com.collection.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.collection.models.PersonVO;
import com.collection.utils.DBConnector;

public class PeopleDAO {
	
	public List<PersonVO> getAll(){
		//List of something
		List<PersonVO> peopleList = new ArrayList<PersonVO>();
		
		Connection con = DBConnector.connect();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement("SELECT * FROM people");
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				
				PersonVO person = new PersonVO();
				
				person.setId(rs.getInt("ID"));
				person.setFirstName(rs.getString("FIRST_NAME"));
				person.setLastName(rs.getString("LAST_NAME"));
				person.setEmail(rs.getString("EMAIL"));
				person.setAddress1(rs.getString("ADDRESS1"));
				person.setCity(rs.getString("CITY"));
				person.setZip(rs.getInt("ZIP"));
				person.setPhone(rs.getString("PHONE"));
				person.setState(rs.getString("STATE"));
				
				
				peopleList.add(person);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return peopleList;
	}
}
