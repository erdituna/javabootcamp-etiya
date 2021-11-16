package ecommerce.dataAccess.abstracts;

import ecommerce.entities.concretes.User;

public interface UserDao {
	void signUp(User user);
	void update(User user);
	void delete(User user);
}
