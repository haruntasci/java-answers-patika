package org.example.models;

import org.example.enums.AuthenticationStatus;
import org.example.exceptions.InvalidAuthenticationException;
import org.example.models.interfaces.IAddress;

import java.util.ArrayList;
import java.util.List;


public abstract class Account {
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insuranceList;

    public Account() {
        this.authenticationStatus = AuthenticationStatus.FAIL;
    }


    public AuthenticationStatus login(String email, String password) {

        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
        }

        if (authenticationStatus != AuthenticationStatus.SUCCESS) {
            try {
                throw new InvalidAuthenticationException();
            } catch (InvalidAuthenticationException e) {
                throw new RuntimeException(e);
            }
        }
        return authenticationStatus;
    }

    public void addNewAddress(IAddress address) {
        if (user.getAddressList() != null) {
            user.getAddressList().add(address);
        } else {
            ArrayList<IAddress> addressArrayList = new ArrayList<>();
            addressArrayList.add(address);
            user.setAddressList(addressArrayList);
        }
    }

    public void removeAddress(IAddress address) {
        if (user.getAddressList() != null) {
            user.getAddressList().remove(address);
        }
    }

    public abstract void addInsurancePolicy();


}
