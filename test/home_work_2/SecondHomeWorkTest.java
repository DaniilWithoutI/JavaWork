package home_work_2;

import home_work_2.loops.HomeWork1;
import home_work_2.loops.HomeWork2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondHomeWorkTest {
    private final HomeWork1 test1 = new HomeWork1();
    private final HomeWork2 test2 = new HomeWork2();

    @Test
    void numberAdd() {
        assertEquals("1 * 2 * 3 * 4 * 5 = 120", test1.numberAdd(5));
        assertEquals("1 * 2 * 3 * 4 * 5 = 120", test1.numberAdd(-5));
        assertEquals("result = 1", test1.numberAdd(1));
    }

    @Test
    void factorial(){
        assertEquals(24, HomeWork2.factorial(4));
        assertEquals(0, HomeWork2.factorial(-5));
        assertEquals(1, HomeWork2.factorial(0));
    }


}
