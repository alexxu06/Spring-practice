package com.example.springboot42.proxies;

import com.example.springboot42.models.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.UUID;

@FeignClient(name = "Payments", url = "${name.service.url}")
public interface PaymentsProxy {
    @PostMapping("/payment")
    public Payment createPayment(@RequestHeader String requestId,
                                 @RequestBody Payment payment);
}
