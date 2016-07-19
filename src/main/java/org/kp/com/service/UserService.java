package org.kp.com.service;

import java.util.List;

import org.kp.com.entity.User;
import org.kp.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	

public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return  userRepository.findAll();
		
	}

	public User findOne(int id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}
}
