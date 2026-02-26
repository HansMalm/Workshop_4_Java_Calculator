package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        int number, firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        System.out.println("Welcome to the Calculator!");
        while (true) {
            System.out.println("Enter two numbers, to calculate.");
            System.out.print("input first number:");
            firstNumber = scanner.nextInt();

            System.out.print("input second number");
            secondNumber = scanner.nextInt();

            System.out.println("Choose operation. input (1) addition, (2) subtraction," +
                    " (3) multiplication or (4) division ");
            System.out.print("operation: ");
            number = scanner.nextInt();


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
