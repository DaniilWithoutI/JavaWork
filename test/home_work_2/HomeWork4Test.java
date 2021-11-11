package home_work_2;

import home_work_2.loops.HomeWork4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeWork4Test {
    @Test
    void abs() {
        HomeWork4 test = new HomeWork4();
        Class<IllegalArgumentException> expected = IllegalArgumentException.class;
        Assertions.assertEquals(56.25, test.abs(7.5, 2));
        Assertions.assertEquals(16, test.abs(2., 4.));
        Assertions.assertThrows(expected, () -> test.abs(5, -8));
    }
}
