package com.calculator;

public enum Operation {
    ADD("+"){
        @Override
        public double apply(double num1, double num2){
            return num1 + num2;
        }
    },
    SUBSTRACT("-"){
        @Override
        public double apply(double num1, double num2){
            return num1 - num2;
        }
    },
    MULTIPLY("*"){
        @Override
        public double apply(double num1, double num2){
            return num1 * num2;
        }
    },
    DIVIDE("/"){
        @Override
        public double apply(double num1, double num2){
            return num1 / num2;
        }
    },
    EXPONENTIATION("^") {
        @Override
        public double apply(double num1, double num2) {
            return Math.pow(num1, num2);
        }
    };

    private final String symbol;

    Operation(String symbol){
        this.symbol = symbol;
    }

    public abstract double apply(double num1, double num2);

    public String getSymbol(){
        return symbol;
    }

    public static Operation fromSymbol(String symbol){
        for(Operation op: Operation.values()) {
            if(op.getSymbol().equals(symbol)){
                return op;
            }
        }
        throw new IllegalArgumentException("Invalid operator " + symbol);
    }

}
