package com.company;

import java.io.*;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) throws IOException {
        FileManager fileManager = new FileManager();
        Object arrayOfCars = fileManager.getObjectsArray();
        for(int i = 0; i < Array.getLength(arrayOfCars); i++) {
            System.out.println(Array.get(arrayOfCars, i));
        }
    }
}
