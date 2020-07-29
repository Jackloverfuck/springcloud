package com.zhou.controller;

import com.zhou.CommonResult.CommonResult;
import com.zhou.entities.Payment;
import com.zhou.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult createPayment(Payment payment) {
        int result = paymentService.createPayment(payment);
        if (result > 0){
            return new CommonResult(200, "插入数据库成功", result);
        }else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);;
        if (payment != null){
            return new CommonResult(200, "查询成功", payment);
        }else {
            return new CommonResult(444, "查询失败", null);
        }
    }
}
