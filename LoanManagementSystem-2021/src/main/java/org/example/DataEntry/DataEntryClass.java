package org.example.DataEntry;

import org.example.Customer;
import org.example.Sourcing.Address;
import org.example.Sourcing.Loan;
import org.example.Sourcing.SourcingData;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class DataEntryClass implements Customer {

    private float Income;
    private float assets;
    private float liability;
    private String Education;
    private Loan loan;

    private SourcingData personalDetails;
    private int id;
    int status;
    String remarks;
    private ArrayList<Customer> fraudCustomer;


    public ArrayList<Customer> getFraudCustomers() {
        return fraudCustomer;
    }

    public void setFraudCustomers(ArrayList<Customer> fraudCustomer) {
        this.fraudCustomer = fraudCustomer;
    }

    public String getRemarks() {
        return remarks;
    }



    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }



    public Adhaar getAdhaarId()
    {
        return personalDetails.getAdhaarId();
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }




    public Loan getLoan() {
        return loan;
    }

    public SourcingData getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(SourcingData personalDetails) {
        this.personalDetails = personalDetails;
    }



    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public void setId(int id) {
        this.id=id;
    }

    public int getId() {

        return id;
    }

    public float getIncome() {
        return Income;
    }

    public void setIncome(float income) {
        Income = income;
    }

    public float getAssets() {
        return assets;
    }

    public void setAssets(float assets) {
        this.assets = assets;
    }

    public float getLiability() {
        return liability;
    }

    public void setLiability(float liability) {
        this.liability = liability;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }


    public float actualIncome() {
        return ((this.Income + this.assets) - this.liability);
    }

    public SourcingData getPersonal()
    {
        return personalDetails;
    }



}
