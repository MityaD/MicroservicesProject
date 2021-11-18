package com.yakut.datahello.util;

import com.yakut.datahello.models.Hello;
import com.yakut.datahello.services.HelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class RabbitMqListener {

    private final HelloService helloService;

    @RabbitListener(queues = "queue1")
    public void processQueue1(String message) {
        log.info("Received from queue1: " + message);
        Hello hello = new Hello();
        hello.setGreetings(message);
        helloService.saveHello(hello);
        log.info("Hello save DB");
    }
}