package home_work_4;

import home_work_4.comparators.DataContainerNumberComparator;

import java.util.Arrays;
import home_work_4.comparators.DataContainerNumberComparator;
import home_work_4.comparators.DataContainerStringComparator;


public class DataContainerMain {
    public static void main(String[] args) {
//        DataContainer<String> container1 = new DataContainer<>(new String[1]);
//        int index1 = container1.add("Привет");
//        int index2 = container1.add("Как дела");
//        int index3 = container1.add("Работаю");
//        int index4 = container1.add("Давай потом");
//        String text1 = container1.get(index1);
//        String text2 = container1.get(index2);
//        String text3 = container1.get(index3);
//        String text4 = container1.get(index4);
//        System.out.println(text1); //Привет
//        System.out.println(text2); //Как дела
//        System.out.println(text3); //Работаю
//        System.out.println(text4); //Давай потом
//        container1.delete(text1);
//        System.out.println(container1.get(index1));
//        System.out.println(container1.toString());
//        DataContainerStringComparator comparator = new DataContainerStringComparator();
//        container.sort(comparator);
//        System.out.println(container.toString());
        DataContainer<Integer> container2 = new DataContainer<>(new Integer[1]);
        container2.add(10);
        container2.add(15);
        container2.add(null);
        container2.add(-3);
        container2.add(0);
        container2.add(15);
        DataContainerNumberComparator comparator = new DataContainerNumberComparator();
        container2.sort(comparator);
        System.out.println(container2.toString());
    }
}
