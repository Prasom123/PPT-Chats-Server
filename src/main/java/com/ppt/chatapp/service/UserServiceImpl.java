package com.ppt.chatapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppt.chatapp.domain.Users;
import com.ppt.chatapp.dto.UsersDto;
import com.ppt.chatapp.exception.userException;
import com.ppt.chatapp.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modalMapper;

	@Override
	public List<UsersDto> getAllUsers() {
		try {
			List<UsersDto> allUsersDto =new ArrayList<UsersDto>();
			List<Users> users = userRepo.findAll();
			Objects.requireNonNull(users, "User data not available");
			if(Objects.nonNull(users) && !users.isEmpty()) {
			 allUsersDto = modalMapper.map(users, new TypeToken<List<UsersDto>>(){}.getType());
			}  
		 	
			return allUsersDto;
		} catch(Exception e) {
			throw new userException(e.getMessage());
		}
		
	}

}
