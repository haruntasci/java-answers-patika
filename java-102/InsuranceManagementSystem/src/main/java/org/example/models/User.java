package org.example.models;

import org.example.models.interfaces.IAddress;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String surName;
    private String email;
    private String password;
    private String occupation;
    private int age;
    private ArrayList<IAddress> addressList;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<IAddress> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<IAddress> addressList) {
        this.addressList = addressList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
