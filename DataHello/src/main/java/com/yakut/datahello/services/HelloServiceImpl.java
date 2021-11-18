package com.yakut.datahello.services;

import com.yakut.datahello.models.Hello;
import com.yakut.datahello.repository.HelloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService{

    private final HelloRepository helloRepository;

    @Override
    public Long getAllQuantityHello() {
        return helloRepository.count();
    }

    @Override
    public void saveHello(Hello hello) {
        helloRepository.save(hello);
    }
}
