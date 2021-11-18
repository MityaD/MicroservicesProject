package com.yakut.datahello.controllers;

import com.yakut.datahello.services.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("data")
public class AllRestController {

    private final HelloService helloService;

    @GetMapping
    public String findCountHello() {
        Long count = helloService.getAllQuantityHello();
        return "С вами поздоровались " + count + " раз";
    }
}
