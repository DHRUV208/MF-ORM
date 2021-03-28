package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class EmployeeService {
    ArrayList<Employee> emps;
    Validation valid = new Validation();

    public void addEmployee(){
       emps.add(new Employee());
    }
    public void addEmployee(long id, String firstName , String lastName , String email){
        emps.add(new Employee(id,firstName,lastName,email));
    }

    public void updateEmployee(){
        System.out.print("Enter ID to update your employee: ");
        Scanner s = new Scanner(System.in);
        long id = s.nextLong();
        for(Employee employee: emps)
        {
            long ID = employee.getId();

            if(getID(employee)==id)
            {
                System.out.println("Your Record Found");
                System.out.println("First Name: "+ employee.getFirstName());
                System.out.println("Last Name: "+ employee.getLastName());
                System.out.println("Email ID: "+ employee.getEmail());
                System.out.print("Choose field to update:(1/2/3 0-Exit");
                int choice;
                do {
                choice = s.nextInt();

                    switch (choice) {
                        case 1 -> {
                            System.out.print("Enter First Name:");
                            employee.setFirstName(s.next());
                        }
                        case 2 -> {
                            System.out.print("Enter Last Name:");
                            employee.setLastName(s.next());
                        }
                        case 3 -> {
                            System.out.print("Enter Email:");
                            employee.setEmail(s.next());
                        }
                        default -> System.out.println("Invalid Choice");
                    }
                }while(choice!=0);
            }
        }
    }
    public void deleteEmployee(){
        System.out.print("Enter ID to delete employee: ");
        Scanner s = new Scanner(System.in);
        long id = s.nextLong();
        emps.removeIf(employee -> employee.getId() == id);
    }
    public long getID(Employee employee)
    {
        return employee.getId();
    }
}
