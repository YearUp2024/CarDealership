package com.pluralsight;

public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometor;
    private double price;

    public Vehicle(double price, int odometor, String color, String vehicleType, String model, String make, int year, int vin) {
        this.price = price;
        this.odometor = odometor;
        this.color = color;
        this.vehicleType = vehicleType;
        this.model = model;
        this.make = make;
        this.year = year;
        this.vin = vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometor(int odometor) {
        this.odometor = odometor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public int getOdometor() {
        return odometor;
    }

    public double getPrice() {
        return price;
    }
}
