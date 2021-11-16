package ecommerce.core;

import ecommerce.google.Google;

public class GoogleServiceAdapter implements GoogleService {

	@Override
	public void signUpwithGoogle(String message) {
		Google google = new Google();
		google.signWithGoogle(message);
	
	}

	

	

}
