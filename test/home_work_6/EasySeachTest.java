package home_work_6;

import home_work_6.search.EasySearch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


class EasySeachTest {
    @DisplayName("Тест для EasySearch")
    @ParameterizedTest
    @MethodSource("searchArgumentsProvider")
    void search(String text, String word, long count){
        EasySearch searchEngine = new EasySearch();
        assertEquals(count, searchEngine.search(text, word));
    }
    static Stream<Arguments> searchArgumentsProvider(){
        return Stream.of(arguments("привет, как дела!", "дела", 1),
                arguments("привет,какдела!", "дела", 0),
                arguments("привет;какдела!", "дела", 0),
                arguments("как дела!.Что делаешь?", "дела", 1),
                arguments("Привет-привет", "привет", 1),
                arguments("Привет -привет", "привет", 1),
                arguments("4-х", "4", 1),
                arguments("один и 1", "1", 1),
                arguments("бабушка бабушке бабушку", "бабушка", 1),
                arguments("Мама мыла раму", "мыл", 0),
                arguments("Какой чудесный день", "", 0),
                arguments("массив[15] элементов", " ", 0),
                arguments("массив[15] элементов", " элементов", 0),
                arguments("массив[15] элементов", "элементов ", 0),
                 arguments("массив[15] элементов", "[", 0),
                arguments("массив[15] элементов", "] ", 0),
                arguments("массив[15] элементов", "5", 0),
                arguments("массив[15] элементов", "15", 1),
                arguments("массив[15] элементов", "массив[15]", 0),
                arguments("массив[15] элементов", "массив[15] элементов", 0),
                arguments("массив[15] элементов", "массив", 1),
                arguments("массив[15] элементов", "массив[15", 0),
                arguments("массив[15] элементов", "]", 0),
                 arguments("массив[15] элементов", "[15", 0)
        );
    }
}
