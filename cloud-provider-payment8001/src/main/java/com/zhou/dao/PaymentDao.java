package com.zhou.dao;

import com.zhou.eneities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao {

    int createPayment(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
