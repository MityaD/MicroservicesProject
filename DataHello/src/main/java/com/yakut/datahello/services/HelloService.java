package com.yakut.datahello.services;

import com.yakut.datahello.models.Hello;

public interface HelloService {

    Long getAllQuantityHello();

    void saveHello(Hello hello);
}
