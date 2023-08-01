package org.example.models;

import org.example.models.interfaces.IAddress;

public class HomeAddress implements IAddress {
    private int streetNumber;
    private String streetName;
    private int apartmentNumber;
    private String apartmentName;
    private String city;
    private int zipCode;
    private String country;

    public HomeAddress(int streetNumber, String streetName, int apartmentNumber, String apartmentName,
                       String city, int zipCode, String country) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
        this.apartmentName = apartmentName;
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
        this.apartmentNumber = apartmentNumber;
        this.apartmentName = apartmentName;
    }

    @Override
    public void updateOtherInfo(String city, int zipCode, String country) {
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
}
