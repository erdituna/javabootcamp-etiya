package ecommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ecommerce.dataAccess.abstracts.UserDao;

import ecommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void signUp(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " : " + "sisteme kayıt oldu.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " : " + "hesabını güncelledi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " : " + "hesabını sildi.");
		
	}

}
