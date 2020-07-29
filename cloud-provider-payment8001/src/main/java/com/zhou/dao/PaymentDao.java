package com.zhou.dao;

import com.zhou.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao {

    int createPayment(Payment payment);

    Payment getPaymentById(@Param("id") long id);
}
