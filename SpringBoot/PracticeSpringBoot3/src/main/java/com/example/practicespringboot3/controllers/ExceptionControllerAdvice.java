package com.example.practicespringboot3.controllers;

import com.example.practicespringboot3.exceptions.NotEnoughMoneyException;
import com.example.practicespringboot3.models.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money ;(");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }

}
