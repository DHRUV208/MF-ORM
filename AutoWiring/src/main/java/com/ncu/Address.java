package com.ncu;

public class Address {
    private String city;
    private String house_no;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", house_no='" + house_no + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }


}
