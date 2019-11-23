package com.fsn.poc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fsn.poc.domain.Cliente;
import com.fsn.poc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);

}
