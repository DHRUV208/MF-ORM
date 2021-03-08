package org.example;

import org.example.DataEntry.DataEntryClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        LoanProcessInterface loanProcess = (LoanProcessInterface) context.getBean("loanProcess");
        Customer customer = (Customer)context.getBean("customer1");
        loanProcess.start(customer);
    }
}
