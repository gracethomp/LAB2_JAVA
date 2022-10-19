package com.company;

public class Car {
    private long id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private long regNumber;

    public Car(long id, String brand, String model, int year, String color, int price, long regNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return id + ". " + brand + " " + model + " " + year +", color: " + color + ", price: " + price +
                ", regNumber: " + regNumber;
    }
}
