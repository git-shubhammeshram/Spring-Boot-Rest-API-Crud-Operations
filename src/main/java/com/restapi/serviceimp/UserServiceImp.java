package com.restapi.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.entity.User;
import com.restapi.repository.UserRepository;
import com.restapi.service.UserService;

@Service
public class UserServiceImp  implements UserService{

	@Autowired
	private UserRepository ur;
	
	
	@Override
	public String upsert(User user) {
		ur.save(user);
		return "User Added!!!";
	}

	@Override
	public User getUserById(Integer id) {
		Optional<User> findById = ur.findById(id);
		if(findById.isPresent()) {
			
			 return findById.get();
		}
		return null;
		
		
		
		
	}

	@Override
	public List<User> getAllUser() {
		
		return ur.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if(ur.existsById(id)) {
			ur.deleteById(id);
			return "User Deleted!!!";
		}
		else {
			
			return "No Record Found";
		}
		
		
	}

}
