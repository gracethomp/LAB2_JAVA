package com.company;

import java.io.IOException;
import java.util.Scanner;

public class InteractiveMenu {
    private static final String VAR_A = "a. A list of cars of given brand";
    private static final String VAR_B = "b. A list of cars of a given model that have been in operation " +
            "for more than n years";
    private static final String VAR_C = "c. A list of cars of a given year of manufacture, " +
            "the price of which is higher than the specified one";
    private static final String ENTER_SENTENCE_CHOICE = "Enter a letter: ";
    private static final String ENTER_SENTENCE_BRAND = "Enter a title of brand: ";
    private static final String ERROR_INPUT = "TRY AGAIN! ";
    private static final String CASE_1 = "a";
    private static final String CASE_2 = "b";
    private static final String CASE_3 = "c";

    private SortingManager sortingManager;

    public InteractiveMenu() throws IOException {
        sortingManager = new SortingManager();
    }

    public SortingManager getSortingManager() {
        return sortingManager;
    }

    public void setSortingManager(SortingManager sortingManager) {
        this.sortingManager = sortingManager;
    }

    public void showMenu(){
        System.out.println(VAR_A);
        System.out.println(VAR_B);
        System.out.println(VAR_C);
        System.out.print(ENTER_SENTENCE_CHOICE);
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        boolean isEnd = false;
        while (!isEnd) {
            switch (choice) {
                case CASE_1 -> {
                    System.out.print(ENTER_SENTENCE_BRAND);
                    sortingManager.sortByBrand(scanner.nextLine());
                    isEnd = true;
                }
                case CASE_2 -> {
                    System.out.println("sorting..");
                    isEnd = true;
                }
                case CASE_3 -> {
                    System.out.println("sorting.");
                    isEnd = true;
                }
                default -> {
                    System.out.print(ERROR_INPUT + ENTER_SENTENCE_CHOICE);
                    choice = scanner.nextLine();
                }
            }
        }
    }

}
