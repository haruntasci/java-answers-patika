package org.example.models.interfaces;

public interface IAddress {
    public void updateStreetInfo(int streetNumber, String streetName);

    public void updateApartmentInfo(int apartmentNumber, String apartmentName);

    public void updateOtherInfo(String city, int zipCode, String country);
}
