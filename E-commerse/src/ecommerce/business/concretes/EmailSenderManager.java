package ecommerce.business.concretes;

import ecommerce.business.abstracts.EmailSender;

public class EmailSenderManager implements EmailSender{

	@Override
	public void sendVerifyEmail() {
		System.out.println("Doğrulama epostası yollandı");
		
	}

	@Override
	public void isEmailClicked() {
		System.out.println("Doğrulama epostasına tıklandı ve kayıt tamamlandı.");
		
	}

	@Override
	public void signUpIsFail() {
		System.out.println("Kayıt olma başarısız oldu.");
		
	}

}
