package com.spock.invoice;

public interface EmailService {
	void sendInvoice(Invoice invoice, String email);
}
