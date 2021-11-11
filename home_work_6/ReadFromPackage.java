package home_work_6;

import home_work_6.search.EasySearch;
import home_work_6.search.api.ISearchEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static home_work_6.Utils.FileUtils.readAllBytes;

public class ReadFromPackage {
    public static void searchInFolder(String folderPath){
        Scanner scanner = new Scanner(System.in);
        ISearchEngine searchEngine = new EasySearch();

        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();

        System.out.println("Добро пожаловать!");
        programText(listOfFiles);

        String filePath = scanner.nextLine();
        String content = readAllBytes(filePath);

        File file = new File("src/home_work_6/files/result.txt");

        boolean ready = true;
        do{
            System.out.println("Пожалуйста, введите искомое слово.");
            String word = scanner.nextLine();
            switch (word){
                case "выход":
                    ready = false;
                    break;

                case "сменить файл":
                    System.out.println(Arrays.toString(listOfFiles));
                    System.out.println("Пожалуйста, выберите файл из списка");
                    filePath = scanner.nextLine();
                    content = readAllBytes(filePath);
                    break;
                default:
                    System.out.println(searchEngine.search(content, word));
                    try(FileWriter writer = new FileWriter(file, true)) {
                        writer.write(filePath + " - " + word + " - " + searchEngine.search(content, word) + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        } while (ready);
    }

    private static void programText(File[] listOfFiles){
        System.out.println("Чтобы выйти из программы, введите 'выход'.");
        System.out.println("Чтобы сменить файл, введите 'сменить файл'.");
        System.out.println("---------------------");
        System.out.println(Arrays.toString(listOfFiles));
        System.out.println("Пожалуйста, выберите файл из списка");
    }
}
