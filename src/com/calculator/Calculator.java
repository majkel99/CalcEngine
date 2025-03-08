package com.calculator;

public class Calculator {
    InputHandler inputHandler;
    OutputHandler outputHandler;

    public Calculator(){
        inputHandler = new InputHandler();
        outputHandler = new OutputHandler();
    }

    public void run(){
        double num1 = inputHandler.getNumberInput();
        double num2 = inputHandler.getNumberInput();
        String operatorSymbol = inputHandler.getOperationInput();
        try {
            Operation operation = Operation.fromSymbol(operatorSymbol);
            double result = operation.apply(num1, num2);
            outputHandler.displayResult(result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            outputHandler.displayError(e.getMessage());
        }
    }
}
