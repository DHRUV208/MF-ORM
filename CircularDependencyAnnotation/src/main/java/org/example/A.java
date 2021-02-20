package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("A")
public class A {

    public A()
    {
        System.out.println("In A");
    }
    @Autowired
    private B b;

}
