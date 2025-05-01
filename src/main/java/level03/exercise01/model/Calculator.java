package level03.exercise01.model;

/**
 * PROGRAM: Calculator
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class Calculator {

    public static double add(double number01, double number02) {
        return number01 + number02;
    }

    public static double subtract(double number01, double number02) {
        return number01 - number02;
    }

    public static double multiply(double number01, double number02) {
        return number01 * number02;
    }

    public static double divide(double number01, double number02) {
        if (number02 != 0) {
            return number01 / number02;
        } else {
            throw new ArithmeticException("Divide by zero");
        }
    }
}
