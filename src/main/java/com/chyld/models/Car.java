package com.chyld.models;

import com.chyld.Gender;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "cars")
public class Car {
    private int carId;
    private String make;
    private String model;
    private String year;
    private int ownerId;

    public Car() { // !!!!!!!!!!!!!!!!!!!!!!!!!!  hibernate needs a default constructor !!!!!!!!!!!!!!!!!!!!!!!
    }

    public Car(String make, String model, String year, int ownerId) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.ownerId = ownerId;
    }

    @Id
    @GeneratedValue
    @Column(name = "car_id", columnDefinition = "int")
    public int getCarId() {
        return carId;
    }
    public void setCarId(int carId) {this.carId = carId;} // !!!!!!!!!!!!!!!!!!!!!!!!!!  hibernate needs getters and setters for everything !!!!!!!!!!!!!!!!!!!!!!!

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Column(name = "owner_id", columnDefinition = "int")
    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

 }
