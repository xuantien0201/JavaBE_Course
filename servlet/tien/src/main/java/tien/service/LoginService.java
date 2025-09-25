package tien.service;

import java.util.List;

import tien.model.User;
import tien.repository.UserRepository;

public class LoginService {
	
	private UserRepository userRepository = new UserRepository();
	public boolean checkLogin(String username, String password) {
		List<User> list = userRepository.getUserByUsername(username, password);
		
		return list.size() > 0 ? true : false;
	}
}
