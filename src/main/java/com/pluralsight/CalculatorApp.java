package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let us multiply your two numbers!");

        //Get first number
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        //Get second number
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Your product is " + firstNumber * secondNumber);

    }
}
