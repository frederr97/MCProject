package general.services;

import org.springframework.mail.SimpleMailMessage;

import general.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
