package home_work_5;

import home_work_5.comparators.StudentAgeComparator;
import home_work_5.comparators.StudentMarkComparator;
import home_work_5.comparators.StudentNameComparator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StudentMain {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        List<Student> filteredStudents = new ArrayList<>();
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10000; i++){
//            String name = nameGenerator(rand);
//            String name = nameGenerator();
            String name = nameGenerator("src/home_work_5/files/names.txt");
            int age = rand.nextInt(7, 17 + 1);
            double mark = rand.nextDouble(0.0, 10.0);
            boolean olympiad = rand.nextBoolean();
            students.add(new Student(i, name, age, mark, olympiad));
            if (students.get(i).getMark() > 8 && students.get(i).getAge() >= 12){
                filteredStudents.add(students.get(i));
            }
        }

        StudentMarkComparator markComparator = new StudentMarkComparator();
        StudentAgeComparator ageComparator = new StudentAgeComparator();
        StudentNameComparator nameComparator = new StudentNameComparator();

        System.out.println("По сколько студентов вывести?");
        int n = scan.nextInt();
//        От меньшего к большему по имени
        System.out.println("Сортировка по имени:");
        filteredStudents.sort(nameComparator);
        toTop(filteredStudents, n);

//          От большего к меньшему по оценке
        filteredStudents.sort(markComparator.reversed());
        System.out.println();
        System.out.println("Сортировка по оценкам:");
        toTop(filteredStudents, n);

//        По возрасту и оценке
        filteredStudents.sort(ageComparator.thenComparing(markComparator));
        System.out.println();
        System.out.println("Сортировка по возрасту и оценкам:");
        for (int i = 7; i <= 17; i++) {
            System.out.println();
            System.out.println("Tоп " + n + " для " + i + "-летних студентов: ");
            for (int j = filteredStudents.size() - 1; j >= 0; j--) {
                if(filteredStudents.get(j).getAge() == i){
                    int index = filteredStudents.lastIndexOf(filteredStudents.get(j));
                    toTop(filteredStudents.subList(index - n, index + 1), n);
                    break;
                }
            }
        }
    }

    public static String nameGenerator(){
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        String[] names = {"Аня", "Петя", "Елена", "Ктулху", "Кристина", "Вячеслав", "Премислав", "Абдульазиз"};
        return names[rnd.nextInt(0, names.length)];
    }

    public static String nameGenerator(ThreadLocalRandom rand){
        String name = "";
        for (int j = 0; j < rand.nextInt(3, 10 + 1); j++) {
            name += (char) rand.nextInt(97, 122 + 1);
            if (j == 0) {
                name = name.toUpperCase();
            }
        }
        return name;
    }

    public static void nameInput(FileWriter writer) throws IOException {
        writer.write("Изя\n");
        writer.write("Гойфман\n");
        writer.write("Ицхак\n");
        writer.write("Сарочка\n");
        writer.write("Циля\n");
        writer.write("Абрашенька\n");
        writer.write("Циммерман\n");
        writer.write("Яшенька\n");
        writer.write("Фимочка\n");
        writer.write("Мойшенька\n");
        writer.close();
    }

    public static String nameGenerator(String fileName){
        List<String> names = new ArrayList<>();

        Reader reader;
        try {
            reader = new FileReader(fileName);
        } catch (FileNotFoundException e1){
            try {
                reader = new FileReader("src/home_work_5/files/default.txt");
            } catch (FileNotFoundException e2) {
                try {
                    File file = new File("src/home_work_5/files/default.txt");
                    FileWriter writer = new FileWriter(file, false);
                    nameInput(writer);
                    reader = new FileReader(file);
                } catch (IOException e3){
                    throw new RuntimeException("Я ну вообще все перепробовал.", e3);
                }
            }
        }

        BufferedReader bufferedReader = new BufferedReader(reader);
        try {
            while (bufferedReader.ready()){
                names.add(bufferedReader.readLine());
            }
        } catch (IOException e){
            throw new RuntimeException("Прости, я читал, но оно не читается.", e);
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return names.get(rnd.nextInt(names.size()));
    }

    public static void toTop(List<Student> filteredStudents, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(filteredStudents.get(i).toString());
        }
    }
}
