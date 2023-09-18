package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = Calculator.instance.get();
        System.out.println("Начало теста ");
    }
    @DisplayName("тест деления")
    @Test
    public void testDivision() {
        BinaryOperator<Integer> division = calculator.divide;
        int result = division.apply(6, 2);
        assertEquals(3, result);
    }

    @DisplayName("Тест возведения в квадрат")
    @Test
    public void testPower() {
        UnaryOperator<Integer> power = calculator.pow;
        int result = power.apply(4);
        assertEquals(16, result);
    }

    @DisplayName("Тест сложения")

    @Test
    public void testAddition() {
        int result = calculator.plus.apply(3, 2);
        assertEquals(5, result);
    }


    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide.apply(6, 0));
    }



}