package home_work_2;

import home_work_2.arrays.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IArraysOperations {
    @ParameterizedTest
    @MethodSource("classArgumentsProvider")
    void outInConsole(IArraysOperation arg){
        Assertions.assertEquals("1 2 3 4 ", arg.outInConsole(new int[]{1, 2, 3, 4}));
    }

    @ParameterizedTest
    @MethodSource("classArgumentsProvider")
    void everySecond(IArraysOperation arg){
        Assertions.assertEquals("2 4 ", arg.everySecond(new int[]{1, 2, 3, 4}));
    }

    @ParameterizedTest
    @MethodSource("classArgumentsProvider")
    void reverse(IArraysOperation arg){
        Assertions.assertEquals("4 3 2 1 ", arg.reverse(new int[]{1, 2, 3, 4}));
    }

    static Stream<Arguments> classArgumentsProvider(){
        return Stream.of(arguments(new DoWhileArrray()),
                arguments(new ForArray()),
                arguments(new ForeachArray()),
                arguments(new WhileArray())
        );
    }
}
