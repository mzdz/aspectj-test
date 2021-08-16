package io.muzhi.service;

import org.springframework.stereotype.Component;

public interface IA {

    default  void aMethod() {
       System.out.println("BeanA a Method");
    }

}
