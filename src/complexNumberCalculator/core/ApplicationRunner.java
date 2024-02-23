package test.task.core;

import test.task.core.impl.ComplexCalculator;
import test.task.core.impl.ComplexNumber;

public class ApplicationRunner {
    private ComplexCalculator calculator;
    public ApplicationRunner(){
        ComplexNumber firstNumber = InputHandler.readComplexNumber("������� ������ ����������� ����� � ������� a+bi:");
        ComplexNumber secondNumber = InputHandler.readComplexNumber("������� ������ ����������� ����� � ������� a+bi:");
        String operation = InputHandler.readOperation("������� ��������, ������� ������ ��������� (+, -, *):");

        calculator = new ComplexCalculator(firstNumber,secondNumber,operation);
    }
    public void runApplicatoin(){
        calculator.run();
    }
}
