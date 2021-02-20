package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("B")
public class B {

    public B()
    {
        System.out.println("In B");
    }
    @Lazy
    @Autowired
    private A a;
}
