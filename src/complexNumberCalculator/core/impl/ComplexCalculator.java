package test.task.core.impl;

import test.task.core.ComplexCalculatorProgram;
import test.task.core.InputHandler;
import test.task.core.OutputHandler;

public class ComplexCalculator implements ComplexCalculatorProgram {
    private ComplexNumber firstNumber;
    private ComplexNumber secondNumber;
    private String operation;

    public ComplexCalculator(ComplexNumber firstNumber, ComplexNumber secondNumber, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }


    private ComplexNumber performOperation() {
        switch (operation) {
            case "+":
                return ComplexOperations.add(firstNumber, secondNumber);
            case "-":
                return ComplexOperations.subtract(firstNumber, secondNumber);
            case "*":
                return ComplexOperations.multiply(firstNumber, secondNumber);
            default:
                System.out.println("Неизвестная операция.");
                return null;
        }
    }
    @Override
    public void run() {
        ComplexNumber result = performOperation();
        OutputHandler.displayResult(result);
    }
}
