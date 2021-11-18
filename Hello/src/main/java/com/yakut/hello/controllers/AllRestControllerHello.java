package com.yakut.hello.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class AllRestControllerHello {

    private final AmqpTemplate amqpTemplate;

    @GetMapping
    public String queueHello() {
        log.info("Emit to queue1");
        amqpTemplate.convertAndSend("queue1", "HelloMessage");
        return "Hello";
    }
}
