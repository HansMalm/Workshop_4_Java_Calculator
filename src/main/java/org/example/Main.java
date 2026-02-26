package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int newCalculation;
        int select;
        double result, firstNumber, secondNumber;

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
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    result = firstNumber + secondNumber;
                    System.out.println(firstNumber + " + " + secondNumber + " = " + result );
                case 2:
                    result = firstNumber - secondNumber;
                    System.out.println(firstNumber + " - " + secondNumber + " = " + result );
                case 3:
                    result = firstNumber * secondNumber;
                    System.out.println(firstNumber + " * " + secondNumber + " = " + result );
                case 4:
                    result = firstNumber / secondNumber;
                    System.out.println(firstNumber + " / " + secondNumber + " = " + result );
            }

            System.out.println("Calculate a new number? input (1) Yes or (0) No");
            System.out.print("input: ");
            newCalculation = scanner.nextInt();
            if (newCalculation == 0) {
                System.out.print("End.");
                break;
            }
        }
    }
}
