package complexNumberCalculator.core.impl;

import complexNumberCalculator.core.ComplexCalculatorProgram;
import complexNumberCalculator.core.OutputHandler;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ComplexCalculator implements ComplexCalculatorProgram {
    private static final Logger logger = Logger.getLogger(ComplexCalculator.class.getName());
    private ComplexNumber firstNumber;
    private ComplexNumber secondNumber;
    private String operation;

    public ComplexCalculator(ComplexNumber firstNumber, ComplexNumber secondNumber, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    private ComplexNumber performOperation() {
        try {
            switch (operation) {
                case "+":
                    return ComplexOperations.add(firstNumber, secondNumber);
                case "-":
                    return ComplexOperations.subtract(firstNumber, secondNumber);
                case "*":
                    return ComplexOperations.multiply(firstNumber, secondNumber);
                default:
                    logger.log(Level.SEVERE, "����������� ��������: " + operation);
                    return null;
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "������ ��� ���������� ��������: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void run() {
        ComplexNumber result = performOperation();
        if (result != null) {
            OutputHandler.displayResult(result);
        }
    }
}
