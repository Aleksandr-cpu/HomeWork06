package complexNumberCalculator.core.impl;

public class ComplexOperations {
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() + num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() + num2.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() - num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() - num2.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() * num2.getRealPart() - num1.getImaginaryPart() * num2.getImaginaryPart();
        double imaginaryPart = num1.getRealPart() * num2.getImaginaryPart() + num1.getImaginaryPart() * num2.getRealPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}

