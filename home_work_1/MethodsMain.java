package home_work_1;

import java.util.Arrays;
import java.util.List;

public class MethodsMain {
    public static void main(String[] args) {
        Methods methods = new Methods();
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        List<Integer> phone1 = Arrays.asList(arr1);
        System.out.println(methods.createPhoneNumber(phone1));
    }
}
