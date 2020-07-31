package com.zhou.service;

import com.zhou.eneities.Payment;

public interface PaymentService {

    int createPayment(Payment payment);

    Payment getPaymentById(Long id);

}
