package org.example;

import org.example.Constants.CommonConstants;
import org.example.Constants.LoanConstants;
import org.example.Constants.StageConstants;


import java.util.ArrayList;

import java.util.Scanner;

public class LoanProcess implements LoanProcessInterface, LoanConstants, StageConstants, CommonConstants {

    private ArrayList<Customer> customers = new ArrayList<>();


    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customer) {
        customers.add(customer);

    }

    public void start(Customer customer) {


        System.out.println("--------Stage 1/4--------");
        customer.setStatus(SOURCING);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First name: ");
        customer.getPersonal().setFname(sc.next());
        System.out.print("Enter Last name: ");
        customer.getPersonal().setLname(sc.next());
        System.out.print("Enter Age: ");
        customer.getPersonal().setAge(sc.nextInt());
        System.out.print("Enter Phone Number: ");
        customer.getPersonal().setPhoneNumber(sc.nextLong());
        System.out.print("Enter emailId: ");
        customer.getPersonal().setEmail(sc.next());

        System.out.println("Enter Address");

// Values for Address
        System.out.print("Enter House number: ");
        String hno = sc.next();
        System.out.print("Enter Landmark: ");
        String landmark = sc.next();
        System.out.print("Enter City: ");
        String city = sc.next();
        System.out.print("Enter Pincode: ");
        int pinCode = sc.nextInt();
        customer.getPersonal().setAddress(hno, landmark, city, pinCode);

        System.out.print("Enter AdhaarId: ");
        customer.getPersonal().setAdhaarId(sc.nextLong());

        System.out.print("Enter PanId: ");
        customer.getPersonal().setPanId(sc.nextLong());
//        if(checkExisting(customer))
//        {
//            System.out.println("User Already Exists");
//            return;
//        }


        customer.setId(customers.size()+1);
        setCustomers(customer);
        System.out.println("Stage 1 Completed");
        customer.setStatus(QDE);
        ApplicationStatus(customer.getId());
    }

    public boolean checkExisting(Customer customer)
    {
        for(Customer existing: customers)
        {

            if (customer.getPersonal().getAdhaarId().equals(existing.getPersonal().getAdhaarId()) && customer.getPersonal().getPanId().equals(existing.getPersonal().getPanId()))
                return true;

        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanProcess that = (LoanProcess) o;
        return customers.equals(that.customers);
    }


    public void qde(Customer customer) {
        Scanner s = new Scanner(System.in);

        System.out.println("Application Number" + customer.getId());
        System.out.println("Name: " + customer.getPersonal().getFname().toUpperCase()
                + " " + customer.getPersonal().getLname().toUpperCase());
        System.out.println("Age: " + customer.getPersonal().getAge());
        System.out.println("Phone number: " + customer.getPersonal().getPhoneNumber());
        System.out.println("Email Id: " + customer.getPersonal().getEmail());


        System.out.println("--------Stage 2/4---------");
        System.out.print("Enter Income: ");
        customer.setIncome(s.nextFloat());
        System.out.print("Enter Assets: ");
        customer.setAssets(s.nextFloat());
        System.out.print("Enter Liabilities: ");
        customer.setLiability(s.nextFloat());
        System.out.print("Enter your Education:/n" +
                "Student(S)" +
                "/nGraduated(G)" +
                "/nNone(N) ");
        customer.setEducation(s.next());
        System.out.println("Total Income: " + customer.actualIncome());
        System.out.println();
        System.out.println("Enter Loan Details");
        System.out.println("Enter Loan Type B-(Business Loan) |" +
                "E-(Education Loan) |" +
                " H-(Home Loan) ");
        customer.getLoan().setType(s.next());
        System.out.print("Enter Loan Amount: ");
        customer.getLoan().setAmount(s.nextDouble());
        customer.setStatus(DEDUPE);
    }

    public void dedupe(Customer customer) {
        System.out.println("--------Stage 3/5--------");

        for (Customer fraud : customer.getFraudCustomers()) {
            if (isFraud(customer, fraud)) {
                customer.setStatus(REJECT);
                customer.setRemarks("Negative Customer");
                System.out.println("Sorry Your Application is Rejected due to Negative Score.");
                break;
            }

        }
        System.out.println("Your have Successfully Passed Stage 3");
        customer.setStatus(SCORING);

    }

    private boolean isFraud(Customer customer, Customer fraud) {

        int haveNegative = 0;
        if (customer.getPersonal().getPhoneNumber().equals(fraud.getPersonal().getPhoneNumber()))
            haveNegative += 10;

        if (customer.getPersonal().getEmail().compareTo(fraud.getPersonal().getEmail()) == 0)
            haveNegative += 10;

        if (customer.getPersonal().getAdhaarId().equals(fraud.getPersonal().getAdhaarId()))
            haveNegative += 10;

        if (customer.getPersonal().getPanId().equals(fraud.getPersonal().getPanId()))
            haveNegative += 10;

        return haveNegative > 0;

    }

    public void scoring(Customer customer) {
        System.out.println("--------Stage 4/5--------");

        int positiveScore = 0;
        if (customer.getPersonal().getAge() < 21 && customer.getPersonal().getAge() > 17 && (customer.getEducation().compareTo(S)) == 0) {
            System.out.println("You have age advantage in Education Loan");
            positiveScore += 60;
        }

        if (customer.actualIncome() >= ((customer.getLoan().getAmount()) / 20)) {
            System.out.println("You have Income Advantage");
            positiveScore += 30;
        }

        customer.getLoan().setScore(positiveScore);
        System.out.println("Your have Successfully Passed Stage 4");
        customer.setStatus(APPROVAL);
    }

    public void approval(Customer customer) {
        System.out.println("--------Stage 5/5--------");

        System.out.println(customer.getLoan().getType());
        if (customer.getLoan().getType().compareTo("H") == 0) {
            if (customer.actualIncome() >= (customer.getLoan().getAmount() / 50)) {
                customer.setRemarks("Home Loan Approved");
                getInstallments(customer.getLoan().getAmount(), customer);
                customer.setStatus(APPROVED);
            } else {
                customer.setRemarks("You don't have enough score to request this Loan");
                customer.setStatus(REJECT);

            }
        } else if (customer.getLoan().getType().compareTo("E") == 0) {
            if (customer.actualIncome() >= (customer.getLoan().getAmount() / 10)) {
                customer.setRemarks("Education Loan Approved");
                getInstallments(customer.getLoan().getAmount(), customer);
                customer.setStatus(APPROVED);
            } else {
                customer.setRemarks("You don't have enough score to request this Loan");
                customer.setStatus(REJECT);

            }

        } else if (customer.getLoan().getType().compareTo("B") == 0) {
            if (customer.actualIncome() >= (customer.getLoan().getAmount() / 20)) {
                customer.setRemarks("Business Loan Approved");
                getInstallments(customer.getLoan().getAmount(), customer);
                customer.setStatus(APPROVED);
            } else {
                customer.setRemarks("You don't have enough score to request this Loan");
                customer.setStatus(REJECT);

            }
        }

    }

    private void getInstallments(double amount, Customer customer) {
        System.out.println("Choose your Duration");
        System.out.println("1. 24 months" + calculatePerMonth(amount, 24, customer) + " per month");
        System.out.println("2. 48 months" + calculatePerMonth(amount, 48, customer) + " per month");
        System.out.println("3. 96 months" + calculatePerMonth(amount, 96, customer) + " per month");
        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch (choice) {
            case 1 -> customer.getLoan().setDuration(24);
            case 2 -> customer.getLoan().setDuration(48);
            case 3 -> customer.getLoan().setDuration(96);
            default -> System.out.println("Invalid Input");
        }

    }

    private double calculatePerMonth(double amount, int months, Customer customer) {
        if (customer.getLoan().getScore() >= 30) {
            customer.getLoan().setRoi(1.3);
            return (amount * months * 1.3) / 100;
        } else if (customer.getLoan().getScore() >= 60) {
            customer.getLoan().setRoi(1.1);
            return (amount * months * 1.1) / 100;
        }

        customer.getLoan().setRoi(1.5);
        return (amount * months * 1.5) / 100;
    }

    public void ApplicationStatus(int applicationNumber) {
        System.out.println("In Application Number");

        for (Customer customer : customers) {
            if (applicationNumber == customer.getId()) {
                if (customer.getStatus() == 2) {
                    qde(customer);
                    if(!cont())
                    {
                        break;
                    }
                } if (customer.getStatus() == 3) {
                    dedupe(customer);
                    if(!cont())
                    {
                        break;
                    }
                } if (customer.getStatus() == 4) {
                    scoring(customer);
                    if(!cont())
                    {
                        break;
                    }
                } if (customer.getStatus() == 5) {
                    approval(customer);

                } if (customer.getStatus() == 6) {
                    System.out.println("Your Application is rejected");
                }

            }
        }



    }

    public boolean cont(){
        System.out.println("Want to Continue Further?(YES/NO)");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next().toUpperCase();
        if(choice.compareTo("Y")==0)
        {
            return true;
        }
        else if(choice.compareTo("N")==0)
        {
            return false;
        }
        else {
            System.out.println("Invalid Choice");
        }
        return cont();
    }

    public void checkLoanStatus(int applicationNumber) {
        for (Customer customer : customers) {
            if (applicationNumber == customer.getId()) {
                if (customer.getStatus() == 0) {
                    System.out.println("Your Loan is Approved");
                } else if (customer.getStatus() == 6) {
                    System.out.println("Loan Rejected");
                } else {
                    System.out.println("Loan in Progress");
                    System.out.println("Want to Continue Loan Process? (YES/NO)");
                    Scanner s = new Scanner(System.in);
                    String cont = s.next().toUpperCase();
                    if (cont()) {
                        ApplicationStatus(applicationNumber);
                    } else {
                        break;
                    }
                }
            }
        }
    }



}
