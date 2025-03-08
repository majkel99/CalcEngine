package com.calculator;

public class OutputHandler {
    public void displayResult(double result){
        System.out.println("Result: " + result);
    }

    public void displayError(String message) {
        System.out.println("Error: " + message);
    }
}
