package complexNumberCalculator.core;

import complexNumberCalculator.core.impl.ComplexNumber;

import java.util.Scanner;
import java.util.logging.Logger;

public class InputHandler {
    private static final Logger logger = Logger.getLogger(InputHandler.class.getName());
    private static Scanner scanner = new Scanner(System.in);

    public static ComplexNumber readComplexNumber(String message) {
        try {
            System.out.println(message);
            String input = scanner.nextLine();
            String[] parts = input.split("\\+");

            double realPart = Double.parseDouble(parts[0]);
            double imaginaryPart = Double.parseDouble(parts[1].substring(0, parts[1].length() - 1));

            return new ComplexNumber(realPart, imaginaryPart);
        } catch (Exception e) {
            logger.severe("Ошибка при чтении комплексного числа: " + e.getMessage());
            System.err.println("Не удалось прочитать комплексное число. Пожалуйста, попробуйте снова.");
            return null;
        }
    }

    public static String readOperation(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}

