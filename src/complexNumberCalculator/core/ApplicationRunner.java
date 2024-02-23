package complexNumberCalculator.core;

import complexNumberCalculator.core.InputHandler;
import complexNumberCalculator.core.impl.ComplexCalculator;
import complexNumberCalculator.core.impl.ComplexNumber;

import java.util.logging.Logger;


public class ApplicationRunner {
    private static final Logger logger = Logger.getLogger(ApplicationRunner.class.getName());
    private ComplexCalculator calculator;

    public ApplicationRunner() {
        ComplexNumber firstNumber = InputHandler.readComplexNumber("������� ������ ����������� ����� � ������� a+bi:");
        if (firstNumber == null) {
            logger.severe("������ ��� ������ ������� ������������ �����");
            System.err.println("�� ������� ��������� ������ ����������� �����. ����������, ���������� �����.");
            return;
        }

        ComplexNumber secondNumber = InputHandler.readComplexNumber("������� ������ ����������� ����� � ������� a+bi:");
        if (secondNumber == null) {
            logger.severe("������ ��� ������ ������� ������������ �����");
            System.err.println("�� ������� ��������� ������ ����������� �����. ����������, ���������� �����.");
            return;
        }

        String operation = InputHandler.readOperation("������� ��������, ������� ������ ��������� (+, -, *):");

        calculator = new ComplexCalculator(firstNumber, secondNumber, operation);
    }

    public void runApplicatoin() {
        try {
            calculator.run();
        } catch (Exception e) {
            logger.severe("������ ��� ���������� ��������: " + e.getMessage());
            System.err.println("��������� ������. ����������, ���������� �����.");
        }
    }
}