package com.example.models;

import com.example.Validations.DepartmentCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotNull(message="This field is Required")
    String name;
    @Size(min=8, message = "Minimum 8 characters Required")
    String password;

    String email;
    @NotNull(message="This field is Required")
    String fname;
    @NotNull(message="This field is Required")
    String lname;
    String dob;
    @DepartmentCode(value="CSE", message="must starts with CSE")
    String universityDp;
    String about;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUniversityDp() {
        return universityDp;
    }

    public void setHobby(String universityDp) {
        this.universityDp = universityDp;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
