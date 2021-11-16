package ecommerce;

import ecommerce.business.abstracts.UserService;
import ecommerce.business.concretes.EmailSenderManager;
import ecommerce.business.concretes.UserManager;
import ecommerce.core.GoogleService;
import ecommerce.core.GoogleServiceAdapter;
import ecommerce.dataAccess.concretes.HibernateUserDao;
import ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Erdi");
		user1.setLastName("Tuna");
		user1.setEmail("erdituna36@gmail.com");
		user1.setPassword("1234567");
		
		
		UserManager userManager = new UserManager(new HibernateUserDao(),new EmailSenderManager(),new GoogleServiceAdapter());
		userManager.signUp(user1);
		
		
	}
	
	
}
