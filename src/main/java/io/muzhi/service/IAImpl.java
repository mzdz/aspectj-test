package io.muzhi.service;

import org.springframework.stereotype.Service;

@Service
public class IAImpl implements IA{

    @Override
    public void aMethod() {
        System.out.println("IA a method");
    }
}
