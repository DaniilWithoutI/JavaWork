package home_work_1;

import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class ICommunicationPrinterTest {

    @ParameterizedTest
    @MethodSource("nameArgumentsProvider")
    void welcome(ICommunicationPrinter a){
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал.", a.welcome("Вася"));
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал.", a.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", a.welcome("Кто угодно другой"));
    }

    static Stream<Arguments> nameArgumentsProvider(){
        return Stream.of(arguments(new NamesWithSwitchFind()),
                arguments(new NameWithElseIfFind()),
                arguments(new NameWithIfFind())
        );
    }
}
