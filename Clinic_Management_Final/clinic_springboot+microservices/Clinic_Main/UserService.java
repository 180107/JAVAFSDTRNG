package com.ust.springboot;

import java.util.List;

public interface UserService {
	
List <User> getUsers();
	
	void saveUser(User use);
	User getUserById(long id);
	void deleteUserById(long id);

}
