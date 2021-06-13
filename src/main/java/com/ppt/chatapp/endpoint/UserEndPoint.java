package com.ppt.chatapp.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ppt.chatapp.consts.UriConsts.UserURIConstants;
import com.ppt.chatapp.dto.UsersDto;
import com.ppt.chatapp.service.UserService;



@Component
@Path(UserURIConstants.ROOT)
@Produces(value = { MediaType.APPLICATION_JSON })
@Consumes(value = { MediaType.APPLICATION_JSON })
public class UserEndPoint {


	@Autowired
	private UserService userServiceImpl;
	
	@GET
	@Path(UserURIConstants.GETALLUSER)
	public List<UsersDto> getAllUsers() {
		System.err.println("Inside getAlluser Api");
		return userServiceImpl.getAllUsers();
	}
}
