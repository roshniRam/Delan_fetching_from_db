package com.example.dell.myapplication;

import android.view.View;

import java.io.Serializable;

public class OrdersItem implements Serializable{

    private String area;
    private String billNumber;
    private String city;
    private String country;
    private String date;
    private int discount;
    private String endTime;
    private int grandTotal;
    private String personJobAssignedTo;
    private String pinCode;
    private String rate;
    private String servicePlace;
    private String servicesRequiredFor;
    private String startTime;
    private String state;
    private String status;
    private String street;
    private String tax;
    private String type;

    public OrdersItem(){

    }


    public OrdersItem(String date, String billNumber, String type, String status, int grandTotal, String area,String city,String country,
                      int discount,String endTime,String servicesRequiredFor,String servicePlace,String startTime,
                      String state,String street,String tax,String pinCode,String personJobAssignedTo,String rate){
        date = date;
        billNumber = billNumber;
        type = type;
        status = status;
        grandTotal = grandTotal;
        area = area;
        city = city;
        country = country;
        discount = discount;
        endTime = endTime;
        servicesRequiredFor = servicesRequiredFor;
        servicePlace = servicePlace;
        startTime = startTime;
        state = state;
        street = street;
        tax = tax;
        pinCode = pinCode;
        personJobAssignedTo = personJobAssignedTo;
        rate = rate;
    }

    public String getDate() {
        return date;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getDiscount() {
        return discount;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getServicesRequiredFor() {
        return servicesRequiredFor;
    }

    public String getServicePlace() {
        return servicePlace;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public String getTax() {
        return tax;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getPersonJobAssignedTo() {
        return personJobAssignedTo;
    }

    public String getRate() {
        return rate;
    }
}
