package org.example.models;

import java.util.Date;

public abstract class Insurance {
    private String name;
    private double price;
    private Date date;

    public abstract double calculate();

}
