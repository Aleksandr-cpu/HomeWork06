package complexNumberCalculator.core;

import complexNumberCalculator.core.InputHandler;
import complexNumberCalculator.core.impl.ComplexCalculator;
import complexNumberCalculator.core.impl.ComplexNumber;

import java.util.logging.Logger;


public class ApplicationRunner {
    private static final Logger logger = Logger.getLogger(ApplicationRunner.class.getName());
    private ComplexCalculator calculator;

    public ApplicationRunner() {
        ComplexNumber firstNumber = InputHandler.readComplexNumber("Введите первое комплексное число в формате a+bi:");
        if (firstNumber == null) {
            logger.severe("Ошибка при чтении первого комплексного числа");
            System.err.println("Не удалось прочитать первое комплексное число. Пожалуйста, попробуйте снова.");
            return;
        }

        ComplexNumber secondNumber = InputHandler.readComplexNumber("Введите второе комплексное число в формате a+bi:");
        if (secondNumber == null) {
            logger.severe("Ошибка при чтении второго комплексного числа");
            System.err.println("Не удалось прочитать второе комплексное число. Пожалуйста, попробуйте снова.");
            return;
        }

        String operation = InputHandler.readOperation("Введите операцию, которую хотите выполнить (+, -, *):");

        calculator = new ComplexCalculator(firstNumber, secondNumber, operation);
    }

    public void runApplicatoin() {
        try {
            calculator.run();
        } catch (Exception e) {
            logger.severe("Ошибка при выполнении операции: " + e.getMessage());
            System.err.println("Произошла ошибка. Пожалуйста, попробуйте снова.");
        }
    }
}