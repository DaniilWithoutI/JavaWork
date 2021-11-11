package home_work_6.threads;

import home_work_6.search.api.ISearchEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SearchWordJob implements Runnable{
    private final ISearchEngine engine;
    private final String text;
    private final String word;
    private final ResultContainer container;
    private final Object lock;
    private final String filePath;
    private final File file = new File("src/home_work_6/files/result.txt");

    public SearchWordJob(ISearchEngine engine, String text,
                         String word, ResultContainer container,
                         Object lock, String filePath) {
        this.engine = engine;
        this.text = text;
        this.word = word;
        this.container = container;
        this.lock = lock;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        long tmp = engine.search(text, word);
        synchronized (lock){
            int result = container.getResult();
            result += tmp;
            container.setResult(result);
            try(FileWriter writer = new FileWriter(file, true)) {
                writer.write(filePath + " - " + word + " - " + container.getResult() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            container.removeCount();
        }
    }
}