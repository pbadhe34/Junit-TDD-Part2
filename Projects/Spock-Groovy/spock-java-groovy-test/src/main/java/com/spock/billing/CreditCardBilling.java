package com.spock.billing;

public class CreditCardBilling {
	public void charge(Client client, double amount) {
		client.setBonus(amount>100);
	}
}
