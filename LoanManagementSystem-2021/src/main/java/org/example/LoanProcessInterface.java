package org.example;

public interface LoanProcessInterface {
    public void start(Customer customer);
    public void ApplicationStatus(int applicationNumber);
    public void checkLoanStatus(int applicationNumber);
}
