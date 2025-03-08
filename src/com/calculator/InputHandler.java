package com.calculator;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;
    public InputHandler(){
        scanner = new Scanner(System.in);
    }

    public double getNumberInput(){
        System.out.println("Enter a number: ");
        while(!scanner.hasNextDouble()){
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public String getOperationInput(){
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        String operator = scanner.next();
        while (!operator.matches("[+\\-*/^]")) {
            System.out.println("Invalid operator. Please enter +, -, *, /, or ^.");
            operator = scanner.next();
        }
        return operator;
    }
}
