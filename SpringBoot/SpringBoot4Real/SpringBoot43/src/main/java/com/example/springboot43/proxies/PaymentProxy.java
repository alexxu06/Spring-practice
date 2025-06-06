package com.example.springboot43.proxies;

import com.example.springboot43.models.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class PaymentProxy {
    private final WebClient webClient;

    @Value("${name.service.url}")
    private String url;

    @Autowired
    public PaymentProxy(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<Payment> createPayment(String reqestId,
                                       Payment payment) {
        return webClient.post()
                .uri(url + "/payment")
                .header("requestId", reqestId)
                .body(Mono.just(payment), Payment.class)
                .retrieve()
                .bodyToMono(Payment.class);
    }
}
