package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRespository userepo;
	
	@Override
	public List<User> getUsers() {
		
		return userepo.findAll();
	}

	@Override
	public void saveUser(User use) {
		this.userepo.save(use);
		
	}

	@Override
	public User getUserById(long id) {
		
		Optional<User> optional = userepo.findById(id);
		User use = null;
		if (optional.isPresent()) {
			use = optional.get();
		} else {
			throw new RuntimeException(" User not found for id :: " + id);
		}
		return use;
		
	}

	@Override
	public void deleteUserById(long id) {
		this.userepo.deleteById(id);
		
	}

}
