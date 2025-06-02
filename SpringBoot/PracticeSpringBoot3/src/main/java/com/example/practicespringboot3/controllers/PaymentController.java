package com.example.practicespringboot3.controllers;

import com.example.practicespringboot3.exceptions.NotEnoughMoneyException;
import com.example.practicespringboot3.models.ErrorDetails;
import com.example.practicespringboot3.models.PaymentDetails;
import com.example.practicespringboot3.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final PaymentService paymentService;
    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(@RequestBody PaymentDetails paymentDetails) {
//        try {
//            PaymentDetails paymentDetails = paymentService.processPayment();
//
//            return ResponseEntity
//                    .status(HttpStatus.ACCEPTED)
//                    .body(paymentDetails);
//        } catch (NotEnoughMoneyException e) {
//            ErrorDetails errorDetails = new ErrorDetails();
//            errorDetails.setMessage("Not enough money ;(");
//            return ResponseEntity
//                    .badRequest()
//                    .body(errorDetails);
//        }

//        PaymentDetails paymentDetails = paymentService.processPayment();
        logger.info("Recieved payment " + paymentDetails.getAmount());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }

}
