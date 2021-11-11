package home_work_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    private final Methods method = new Methods();

    @Test
    void sleepln(){
        assertTrue(method.sleepln(false, true));
        assertFalse(method.sleepln(true, false));
        assertTrue(method.sleepln(false, false));

    }

    @Test
    void createPhoneNumber(){
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Byte[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Short[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        List<Integer> phone1 = Arrays.asList(arr1);
        List<Byte> phone2 = Arrays.asList(arr2);
        List<Short> phone3 = Arrays.asList(arr3);
        assertEquals("(123)4567-890", method.createPhoneNumber(phone1));
        assertEquals("(123)4567-890", method.createPhoneNumber(phone2));
        assertEquals("(123)4567-890", method.createPhoneNumber(phone3));
    }

    @Test
    void toBinaryString(){
        assertEquals("00101010", method.toBinaryString((byte) 42));
        assertEquals("11010110", method.toBinaryString((byte) -42));
        assertEquals("00001111", method.toBinaryString((byte) 15));
        assertEquals("11110001", method.toBinaryString((byte) -15));
        assertEquals("00000000", method.toBinaryString((byte) 0));
    }
}
