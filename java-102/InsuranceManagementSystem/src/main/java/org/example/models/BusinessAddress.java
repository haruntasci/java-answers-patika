package org.example.models;

import org.example.models.interfaces.IAddress;

public class BusinessAddress implements IAddress {
    private int streetNumber;
    private String streetName;
    private int companyNumber;
    private String companyName;
    private String city;
    private int zipCode;
    private String country;

    public BusinessAddress(int streetNumber, String streetName, int apartmentNumber, String apartmentName, String city, int zipCode, String country) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.companyNumber = apartmentNumber;
        this.companyName = apartmentName;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    @Override
    public void updateStreetInfo(int streetNumber, String streetName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
    }

    @Override
    public void updateApartmentInfo(int apartmentNumber, String apartmentName) {
        this.companyNumber = apartmentNumber;
        this.companyName = apartmentName;
    }

    @Override
    public void updateOtherInfo(String city, int zipCode, String country) {
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
}
