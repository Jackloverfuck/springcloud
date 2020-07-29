package com.zhou.service;

import com.zhou.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    int createPayment(Payment payment);

    Payment getPaymentById(long id);

}
