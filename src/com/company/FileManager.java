package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class FileManager {
    private static final String FILE_NAME = "src/com/company/data.txt";

    private int getLinesCount() throws IOException {
        LineNumberReader lineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(FILE_NAME)));
        int size = 0;
        while (lineNumberReader.readLine() != null)
            size = lineNumberReader.getLineNumber();
        return size;
    }

    public Object getObjectsArray() throws IOException {
        FileReader fileReader = new FileReader(FILE_NAME);
        Scanner scanner = new Scanner(fileReader);
        Object arrayOfCars = new Car[getLinesCount()];
        int j = 0;
        while (scanner.hasNextLine()){
            String[] s = scanner.nextLine().split(" ");
            Car car = new Car(Integer.parseInt(s[0]), s[1], s[2], Integer.parseInt(s[3]),
                    s[4], Integer.parseInt(s[5]), Long.parseLong(s[6]));
            Array.set(arrayOfCars, j, car);
            j++;
        }
        return arrayOfCars;
    }
}
