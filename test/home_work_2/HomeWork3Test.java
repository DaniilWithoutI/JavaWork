package home_work_2;

import home_work_2.loops.HomeWork3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HomeWork3Test {
    private final HomeWork3 test = new HomeWork3();

    @ParameterizedTest
    @MethodSource("generatorForAddAllParts")
    @DisplayName("Тест перемножения цифр")
    public void addAllParts(long expected, long... parts){
        long result = test.addAllParts(parts);
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> generatorForAddAllParts() {
        return Stream.of(
                Arguments.arguments(6, new long[]{1, 2, 3}),
                Arguments.arguments(1, new long[0])
        );
    }

    @Test
    public void parseInput(){
        Class<IllegalArgumentException> expected = IllegalArgumentException.class;
        Assertions.assertThrows(expected, () -> test.parseInput("3.5"));
        Assertions.assertThrows(expected, () -> test.parseInput("A"));
        Assertions.assertEquals(3, test.parseInput("3"));
    }

    @Test
    public void numberToParts(){
        Assertions.assertArrayEquals(new long[]{3, 4, 5}, test.numberToParts(345));
        Assertions.assertArrayEquals(new long[]{4, 5, 0}, test.numberToParts(450));
    }
}
