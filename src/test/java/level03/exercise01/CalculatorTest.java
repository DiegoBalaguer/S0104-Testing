package level03.exercise01;

import level03.exercise01.model.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

/**
 * PROGRAM: CalculatorTest
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class CalculatorTest {

    @BeforeEach
    void setUp() {

    }

    @ParameterizedTest
    @MethodSource("additionProvider")
    public void givenTwoNumbers_whenAdd_thenReturnsCorrectSum(double operator01, double operator02, double expected) {
        assertEquals(expected, Calculator.add(operator01, operator02));
    }

    static Stream<Arguments> additionProvider() {
        return Stream.of(
                of(12, 8, 20),
                of(20, 0, 20),
                of(-10, 5, -5),
                of(0, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("subtractionProvider")
    public void givenTwoNumbers_whenSubtract_thenReturnsCorrectDifference(double operator01, double operator02, double expected) {
        assertEquals(expected, Calculator.subtract(operator01, operator02));
    }

    static Stream<Arguments> subtractionProvider() {
        return Stream.of(
                of(12, 8, 4),
                of(20, 0, 20),
                of(-10, 5, -15),
                of(0, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplicationProvider")
    public void givenTwoNumbers_whenMultiply_thenReturnsCorrectProduct(double operator01, double operator02, double expected) {
        assertEquals(expected, Calculator.multiply(operator01, operator02));
    }

    static Stream<Arguments> multiplicationProvider() {
        return Stream.of(
                of(6, 6, 36),
                of(3, 4, 12),
                of(-4, 5, -20),
                of(10, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("divisionProvider")
    public void givenTwoNumbers_whenDivide_thenReturnsCorrectQuotient(double operator01, double operator02, double expected) {
        assertEquals(expected, Calculator.divide(operator01, operator02));
    }

    static Stream<Arguments> divisionProvider() {
        return Stream.of(
                of(12, 4, 3),
                of(20, 5, 4),
                of(-10, 5, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("divisionByZeroProvider")
    public void givenDivideByZero_whenDivide_thenThrowsArithmeticException(double operator01, double operator02) {
        assertThatThrownBy(() -> Calculator.divide(operator01, operator02))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Divide by zero");
    }

    static Stream<Arguments> divisionByZeroProvider() {
        return Stream.of(
                of(5, 0),
                of(-3, 0)
        );
    }
}
