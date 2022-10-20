package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;

public class SortingManager {

    private final Car[] cars = FileManager.getObjectsArray();

    public SortingManager() throws IOException {
    }

    public void sortByBrand(String mark) {
        for(int i = 0; i < Array.getLength(cars); i++) {
            if(cars[i].getBrand().equals(mark))
                System.out.println(cars[i]);
        }
    }

    public void sortByModelAndUsage(String model, int year) {
        int currentYear = LocalDate.now().getYear();
        for(int i = 0; i < Array.getLength(cars); i++) {
            if(cars[i].getModel().equals(model) && (currentYear - cars[i].getYear()) > year) {
                System.out.println(cars[i]);
            }
        }
    }

    public void sortByYearAndPrice(int year, int price){
        for(int i = 0; i < Array.getLength(cars); i++){
            if(cars[i].getYear()==year && cars[i].getPrice()>price){
                System.out.println(cars[i]);
            }
        }
    }
}
