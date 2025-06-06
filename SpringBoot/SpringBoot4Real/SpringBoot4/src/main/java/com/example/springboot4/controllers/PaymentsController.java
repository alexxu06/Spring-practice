package com.example.springboot4.controllers;

import com.example.springboot4.models.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {
    private final Logger logger = Logger.getLogger(PaymentsController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(@RequestHeader String requestId,
                                                 @RequestBody Payment payment) {
        logger.info("Received request with ID " + requestId + " Payment Amount: " + payment.getAmount());
        payment.setId(UUID.randomUUID().toString());
        System.out.println("ths run");

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("requestID", requestId)
                .body(payment);
    }
}
