package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        int number, firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        System.out.println("Welcome to the Calculator!");
        while (true) {
            System.out.println("Enter a number to calculate.");
            System.out.print("input:");
            number = scanner.nextInt();
            System.out.println("number = " + number);
            System.out.println("input (1) to calculate a new number,");
            System.out.println("or input (2) to end.");
            System.out.print("input: ");
            number = scanner.nextInt();
            if (number == 0) {
                System.out.print("End.");
                break;
            }
        }
    }
}
