package ecommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ecommerce.business.abstracts.EmailSender;
import ecommerce.business.abstracts.UserService;
import ecommerce.core.GoogleService;
import ecommerce.dataAccess.abstracts.UserDao;
import ecommerce.dataAccess.concretes.HibernateUserDao;
import ecommerce.entities.concretes.User;

public class UserManager implements UserService {

List<String> emailList=new ArrayList<String>();
	
	private UserDao userDao;
	private EmailSender emailSender;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao, EmailSender emailSender, GoogleService googleService) 
	{
		super();
		this.userDao = userDao;
		this.emailSender = emailSender;
		this.googleService = googleService;
	}
	
	public UserManager(UserDao userDao, EmailSender emailSender) 
	{
		super();
		this.userDao = userDao;
		this.emailSender = emailSender;
	}

	@Override
	public void signUp(User user) {
		if(mailVerification(user)==true && passwordVerification(user)==true)
		{
			emailList.add(user.getEmail());
			this.emailSender.sendVerifyEmail();
			this.emailSender.isEmailClicked();
			this.userDao.signUp(user);
			
			
		}
		else
		{
			this.emailSender.signUpIsFail();
		}
		
	}
	
	@Override
	public void update(User user) {
		
		userDao.update(user);
		System.out.println("Kullanýcý hesabýný güncelledi.");
		
	}

	@Override
	public void delete(User user) {
		
		userDao.delete(user);
		System.out.println("Kullanýcý hesabýný sildi.");
		
		
	}

	
	public boolean mailVerification(User user) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);

	    Matcher matcher = pattern.matcher(user.getEmail());
		if(matcher.matches()==true && emailList.contains(user.getEmail())==false)
		{
			emailList.add(user.getEmail());
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public boolean passwordVerification(User user) {
		String regex = "[0-9a-zA-Z]{6,}";
		Pattern pattern = Pattern.compile(regex);

	    Matcher matcher = pattern.matcher(user.getPassword());
		if(matcher.matches()==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public boolean nameVerification(User user) {
		String regex = "[0-9a-zA-Z]{6,}";
		Pattern pattern = Pattern.compile(regex);

	    Matcher matcher = pattern.matcher(user.getFirstName());
	    Matcher matcherLastName = pattern.matcher(user.getLastName());
		if(matcher.matches()==true && matcherLastName.matches()==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
