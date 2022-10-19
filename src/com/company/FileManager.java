package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class FileManager {
    private static final String FILE_NAME = "src/com/company/data.txt";
    private static final String SPLIT_SYMBOL = " ";
    private static final String TO_REPLACE = "_";

    private static int getLinesCount() throws IOException {
        LineNumberReader lineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(FILE_NAME)));
        int size = 0;
        while (lineNumberReader.readLine() != null)
            size = lineNumberReader.getLineNumber();
        return size;
    }

    public static Car[] getObjectsArray() throws IOException {
        FileReader fileReader = new FileReader(FILE_NAME);
        Scanner scanner = new Scanner(fileReader);
        Car[] arrayOfCars = new Car[getLinesCount()];
        int j = 0;
        while (scanner.hasNextLine()){
            String[] s = scanner.nextLine().split(SPLIT_SYMBOL);
            Car car = new Car(Integer.parseInt(s[0]), s[1], s[2].replace(TO_REPLACE, SPLIT_SYMBOL),
                    Integer.parseInt(s[3]), s[4].replace(TO_REPLACE, SPLIT_SYMBOL),
                    Integer.parseInt(s[5]), Long.parseLong(s[6]));
            Array.set(arrayOfCars, j, car);
            j++;
        }
        return arrayOfCars;
    }
}
