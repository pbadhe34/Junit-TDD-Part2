package app.test;

interface PaymentGateway {
    boolean makePayment(BigDecimal amount)
}