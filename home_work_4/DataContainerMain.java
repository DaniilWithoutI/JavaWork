package home_work_4;

import home_work_4.comparators.DataContainerNumberComparator;

import java.util.Arrays;
import home_work_4.comparators.DataContainerNumberComparator;
import home_work_4.comparators.DataContainerStringComparator;


public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[1]);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.get(index1));
        System.out.println(container.toString());
        DataContainerStringComparator comparator = new DataContainerStringComparator();
        container.sort(comparator);
        System.out.println(container.toString());
    }
}
