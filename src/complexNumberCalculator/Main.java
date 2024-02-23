package test.task;

import test.task.core.ApplicationRunner;
import test.task.core.impl.ComplexCalculator;

public class Main {
    private static ComplexCalculator cal;

    public static void main(String[] args) {
        ApplicationRunner appRunner = new ApplicationRunner();
        appRunner.runApplicatoin();
    }
}
