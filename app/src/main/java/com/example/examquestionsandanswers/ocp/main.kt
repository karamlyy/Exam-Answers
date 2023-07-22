package com.example.examquestionsandanswers.ocp

fun main() {
    val paymentProcessor = PaymentProcessor()

    val creditCardPayment = CreditCardPayment()
    val payPalPayment = PayPalPayment()

    paymentProcessor.processPayment(creditCardPayment)
    paymentProcessor.processPayment(payPalPayment)
}
