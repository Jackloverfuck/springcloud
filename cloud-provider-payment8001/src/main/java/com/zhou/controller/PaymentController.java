package com.zhou.controller;

import com.zhou.entities.Payment;
import com.zhou.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    public int createPayment(Payment payment) {
        return paymentService.createPayment(payment);
    }

    public Payment getPaymentById(long id) {
        return paymentService.getPaymentById(id);
    }
}
