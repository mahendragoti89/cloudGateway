package com.cloud.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

    @RequestMapping("/orderFallback")
    public Mono<String> orderFallback(){
return Mono.just("Orderservice is down");
    }

    @RequestMapping("/paymentFallback")
    public Mono<String> requestFallback(){
        return Mono.just("Paymentservice is down");
    }

}
