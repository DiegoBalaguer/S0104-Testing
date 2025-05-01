package level03.exercise01.application;

import level03.exercise01.utils.ConsoleUtils;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class ApplicationController {
    private final CalculatorWorkers calculatorWorkers;

    public ApplicationController() {
        this.calculatorWorkers = new CalculatorWorkers();
    }

    public void run() {
        do {
            System.out.println(System.lineSeparator() + "TEXT CALCULATOR ..............");
            calculatorWorkers.resetCalculator();
            getOperator01();

            if (calculatorWorkers.getOperator01() != 0) {
                getOperator();
                getOperator02();
                showResultOperation();
            }
        } while (calculatorWorkers.getOperator01() != 0);
        ConsoleUtils.closeScanner();
    }

    private void showResultOperation() {
        try {
            System.out.println(calculatorWorkers.getResultOperation());
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private void getOperator01() {
        calculatorWorkers.setOperator01(ConsoleUtils.readRequiredDouble("Input operator one ('0' to quit): "));
    }

    private void getOperator() {
        do {
            try {
                calculatorWorkers.setOperator(ConsoleUtils.readRequiredString("Input operator ('+', '-', '" +
                        "+', '/'): "));
                return;
            } catch (IllegalArgumentException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        } while (true);
    }

    private void getOperator02() {
        calculatorWorkers.setOperator02(ConsoleUtils.readRequiredDouble("Input operator two: "));
    }
}