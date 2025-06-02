package com.example.practicespringboot3.services;

import com.example.practicespringboot3.exceptions.NotEnoughMoneyException;
import com.example.practicespringboot3.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }

}
