package ecommerce.business.abstracts;

import java.util.List;

import ecommerce.entities.concretes.User;

public interface UserService {

	void signUp(User user);
	void update(User user);
	void delete(User user);
	boolean mailVerification(User user);
	boolean passwordVerification(User user);
	boolean nameVerification(User user);
} 
