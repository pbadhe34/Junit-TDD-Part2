package com.invoice

import spock.lang.*

import com.spock.invoice.Customer
import com.spock.invoice.EmailService
import com.spock.invoice.FinalInvoiceStep
import com.spock.invoice.Invoice
import com.spock.invoice.PrinterService

class InvoiceMailingSpec extends spock.lang.Specification{ 
 
	def "electronic invoices to active email addresses"() { 
		given:"an invoice, a customer, a mail server and a printer"
		PrinterService printerService = Mock(PrinterService) 
		EmailService emailService = Mock(EmailService)
		Customer customer = new Customer()
		FinalInvoiceStep finalInvoiceStep = new FinalInvoiceStep(printerService, emailService)
		Invoice invoice = new Invoice()
 
		when: "customer is normal and has an email inbox" 
		customer.hasEmail("acme@example.com")
		finalInvoiceStep.handleInvoice(invoice, customer)
 
		then: "nothing should be printed. Only an email should be sent"
		0 * printerService.printInvoice(invoice) 
		1 * emailService.sendInvoice(invoice,"acme@example.com")
	}
} 

