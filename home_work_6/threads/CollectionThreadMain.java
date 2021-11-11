package home_work_6.threads;

import home_work_6.search.EasySearch;
import home_work_6.search.api.ISearchEngine;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static home_work_6.Utils.FileUtils.readAllBytes;

public class CollectionThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String directoryPath = "src/home_work_6/files";

        File directory = new File(directoryPath);

        if (!directory.isDirectory()) throw new IllegalStateException("Передан некорректный адрес папки");

        if (!directory.canRead()) throw new IllegalStateException("Нет доступа к папке");

        File[] files = directory.listFiles(file -> file.getName().endsWith(".txt"));

        ISearchEngine engine = new EasySearch();
        ResultContainer container = new ResultContainer();
        Object lock = new Object();

        ExecutorService executorService = Executors.newFixedThreadPool(files.length);

        System.out.println("Введите слово для поиска");
        String word = scanner.nextLine();

        while (!word.isEmpty()) {
            for (File file : files) {
                String absolutePath = file.getPath();

                String text = readAllBytes(absolutePath);

                executorService.submit(new SearchWordJob(engine, text, word, container, lock, absolutePath));
            }
            System.out.println("Введите слово для поиска");
            word = scanner.nextLine();
        }

        executorService.shutdown();

        System.out.println("Результат " + container.getResult());
    }
}
