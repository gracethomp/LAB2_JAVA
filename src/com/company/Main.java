package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(1, "BMV", "X7(G07)", 2018, "dark red", 50000, 10000000);
        Car car2 = new Car(2, "BMV", "X6(F16)", 2014, "dark grey", 23000, 10020000);
        Car car3 = new Car(3, "Citroen", "C3 Aircross", 2017, "blue", 43000, 20000000);
        Car car4 = new Car(4, "Citroen", "C5 Aircross", 2018, "dark grey", 41000, 20043000);
        Car car5 = new Car(5, "Citroen", "C4 5-doors", 2015, "red", 46500, 22300000);
        Car car6 = new Car(6, "Citroen", "Berlingo Multispace", 2018, "grey", 33000, 20005021);
        Car car7 = new Car(7, "Lexus", "UX 250h", 2018, "blue", 49550, 34005000);
        Car car8 = new Car(8, "Lexus", "RC 200t/350", 2013, "red", 33000, 30060900);
        Car car9 = new Car(9, "Opel", "Combo", 2011, "dark red", 20000, 40550000);
        Car car10 = new Car(10, "Suzuki", "SX4", 2016, "dark blue", 39000, 51040008);
        Car car11 = new Car(11, "Suzuki", "Jimmy", 2012, "white", 31500, 54500000);
        Object arrayOfCars = new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11};
        for(int i = 0; i < Array.getLength(arrayOfCars); i++) {
            System.out.println(Array.get(arrayOfCars, i));
        }

    }
}
