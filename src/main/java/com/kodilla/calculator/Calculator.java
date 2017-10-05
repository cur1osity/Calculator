package com.kodilla.calculator;

import java.util.Scanner;

public class Calculator {

    private double a;
    private double b;
    private double answer;

    public void addition() {

        this.operation();
        answer = a + b;

        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
        System.out.println(a + " + " + b + " = " + answer );
        System.out.println("--------------------");
    }

    public void subtraction() {

        this.operation();
        answer = a - b;

        System.out.println("xxxxxxxxxxxxxxxxxxxx");
        System.out.println(a + " - " + b + " = " + answer );
        System.out.println("--------------------");
    }

    private void operation() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = scanner.nextDouble();

        System.out.println("Enter second number: ");
        b = scanner.nextDouble();
    }
}

