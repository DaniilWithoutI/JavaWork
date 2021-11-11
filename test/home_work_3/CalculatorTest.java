package home_work_3;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculatorTest {
    @DisplayName("Тест для сложения")
    @ParameterizedTest
    @MethodSource("plusArgumentsProvider")
    void plus(double a, double b, double c){
            calcProvider().forEach(calculator -> {
                double result = calculator.plus(a, b);
                assertEquals(c, result);
            });
    }

    static Stream<Arguments> plusArgumentsProvider(){
        return Stream.of(arguments(-3, -2, -5),
                arguments(0, 5, 5),
                arguments(2.5, 5.5, 8)
        );
    }

    @DisplayName("Тест для умножения")
    @ParameterizedTest
    @MethodSource("addArgumentsProvider")
    void add(double a, double b, double c){
        calcProvider().forEach(calculator -> {
            double result = calculator.add(a, b);
            assertEquals(c, result);
        });
    }

    static Stream<Arguments> addArgumentsProvider(){
        return Stream.of(arguments(-3, -2, 6),
                arguments(0, 5, 0),
                arguments(2.5, 5.5, 13.75)
        );
    }

    @DisplayName("Тест для вычитания")
    @ParameterizedTest
    @MethodSource("minusArgumentsProvider")
    void minus(double a, double b, double c){
        calcProvider().forEach(calculator -> {
            double result = calculator.minus(a, b);
            assertEquals(c, result);
        });
    }

    static Stream<Arguments> minusArgumentsProvider(){
        return Stream.of(arguments(-3, -2, -1),
                arguments(0, 5, -5),
                arguments(2.5, 5.5, -3)
        );
    }

    @DisplayName("Тест для деления")
    @ParameterizedTest
    @MethodSource("divArgumentsProvider")
    void div(double a, double b, double c){
        calcProvider().forEach(calculator -> {
            double result = calculator.div(a, b);
            assertEquals(c, result);
        });
    }

    static Stream<Arguments> divArgumentsProvider(){
        return Stream.of(arguments(-3, -2, 1.5),
                arguments(0, 5, 0),
                arguments(2.5, 0.25, 10.0)
        );
    }

    @DisplayName("Тест для нахождения модуля")
    @ParameterizedTest
    @MethodSource("absArgumentsProvider")
    void abs(double a, double b){
        calcProvider().forEach(calculator -> {
            double result = calculator.abs(a);
            assertEquals(b, result);
        });
    }

    static Stream<Arguments> absArgumentsProvider(){
        return Stream.of(arguments(-3, 3),
                arguments(0, 0),
                arguments(2.5, 2.5)
        );
    }

    @DisplayName("Тест для возведения в степень")
    @ParameterizedTest
    @MethodSource("powArgumentsProvider")
    void pow(double a, int b, double c){
        calcProvider().forEach(calculator -> {
            double result = calculator.pow(a, b);
            assertEquals(c, result);
        });
    }

    static Stream<Arguments> powArgumentsProvider(){
        return Stream.of(arguments(-3, 2, 9),
                arguments(0, 5, 0),
                arguments(2.5, 2, 6.25),
                arguments(2, 0, 1),
                arguments(2, -2, 0.25)
                );
    }

    @DisplayName("Тест для нахождения корня")
    @ParameterizedTest
    @MethodSource("sqrtArgumentsProvider")
    void sqrt(double a, double b){
        calcProvider().forEach(calculator -> {
            double result = calculator.sqrt(a);
            assertEquals(b, result);
        });
    }

    static Stream<Arguments> sqrtArgumentsProvider(){
        return Stream.of(arguments(-4, NaN),
                arguments(4, 2),
                arguments(6.25, 2.5),
                arguments(0, 0),
                arguments(1, 1)
        );
    }

    static Stream<ICalculator> calcProvider(){
        return Stream.of(new CalculatorWithMathCopy(),
                new CalculatorWithOperator(),
                new CalculatorWithCounterClassic()
        );
    }
}
