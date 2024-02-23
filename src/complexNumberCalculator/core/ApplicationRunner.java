package complexNumberCalculator.core;

import complexNumberCalculator.core.impl.ComplexCalculator;
import complexNumberCalculator.core.impl.ComplexNumber;

public class ApplicationRunner {
    private ComplexCalculator calculator;
    public ApplicationRunner(){
        ComplexNumber firstNumber = InputHandler.readComplexNumber("¬ведите первое комплексное число в формате a+bi:");
        ComplexNumber secondNumber = InputHandler.readComplexNumber("¬ведите второе комплексное число в формате a+bi:");
        String operation = InputHandler.readOperation("¬ведите операцию, которую хотите выполнить (+, -, *):");

        calculator = new ComplexCalculator(firstNumber,secondNumber,operation);
    }
    public void runApplicatoin(){
        calculator.run();
    }
}
