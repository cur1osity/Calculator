package com.kodilla.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        int choice;
        boolean notQuit = true;

        while (notQuit) {

            printList();
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    notQuit = false;
                    break;

                case 1:
                    System.out.println("Addition selected.");
                    calculator.addition();
                    break;

                case 2:
                    System.out.println("Subtraction selected.");
                    calculator.subtraction();
                    break;
                default:
                    System.out.println("Enter correct number!");

            }
        }
    }


    private static void printList() {
        System.out.println("\nPress: ");
        System.out.println("\t 1 for (+)");
        System.out.println("\t 2 for (-)");
        System.out.println("\t 0 - To quit the application.");

    }
}


