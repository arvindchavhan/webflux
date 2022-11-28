package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Component
public class OpeningBalanceController {

    private final WebClient client;
    private static Logger logger = LoggerFactory.getLogger(OpeningBalanceController.class);
    
    public OpeningBalanceController(WebClient.Builder builder){
        this.client = builder.baseUrl("http://localhost:8080").build();
        logger.info("Initialised done....");
    }

    public Mono<BalanceSheet> processSODBalance() {
        logger.info("Here it is processing balances.");
        return this.client.get().uri("/balance").accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(BalanceSheet.class);
    }
}
