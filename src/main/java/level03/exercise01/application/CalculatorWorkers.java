package level03.exercise01.application;

import level03.exercise01.model.Calculator;

/**
 * PROGRAM: CalculatorWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class CalculatorWorkers {

    private double operator01;
    private String operator;
    private double operator02;

    public CalculatorWorkers() {
        resetCalculator();
    }

    public void setOperator01(double operator01) {
        this.operator01 = operator01;
    }

    public void setOperator(String operator) {
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            this.operator = operator;
        } else {
            throw new IllegalArgumentException("Illegal operator");
        }
    }

    public double getOperator01() {
        return operator01;
    }

    public void setOperator02(double operator02) {
        this.operator02 = operator02;
    }

    public void resetCalculator() {
        operator01 = 0;
        operator = "";
        operator02 = 0;
    }

    public String getResultOperation() {
        return "Operation: " + operator01 + " " + operator + " " + operator02 + " = " + getResult();

    }

    private double getResult() {
        return switch (operator) {
            case "+" -> Calculator.add(operator01, operator02);
            case "-" -> Calculator.subtract(operator01, operator02);
            case "*" -> Calculator.multiply(operator01, operator02);
            case "/" -> Calculator.divide(operator01, operator02);
            default -> throw new IllegalArgumentException("Illegal operator");
        };
    }


}
