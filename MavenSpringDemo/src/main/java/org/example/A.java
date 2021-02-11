package org.example;

public class A {
    private B b;
    public A()
    {
        System.out.println("In Constructor A");
    }
    public B getB()
    {
        return b;
    }

    public void setB(B b) {
        System.out.println("In B");
        this.b = b;

    }

}
