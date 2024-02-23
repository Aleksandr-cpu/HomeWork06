package complexNumberCalculator.core;

import complexNumberCalculator.core.impl.ComplexCalculator;
import complexNumberCalculator.core.impl.ComplexNumber;

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
