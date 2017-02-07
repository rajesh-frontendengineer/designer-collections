package com.collection.rest.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.collection.dao.PeopleDAO;
import com.collection.models.PersonVO;

//api/people/all

@Path("/people")
public class PeopleService {
	//getall
	//getperson
	//deleteperson
	//edit
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PersonVO> getAll(){
		PeopleDAO dao = new PeopleDAO();
		List<PersonVO> peopleList = dao.getAll();
		
		return peopleList;
	}
//	
//	@Path("/add")
//	public void addPerson(){
//		
//	}
//	@Path("/edit")
//	public void editPerson(){
//		
//	}
}

