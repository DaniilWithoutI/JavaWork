package home_work_6;

import home_work_6.search.EasySearch;
import home_work_6.search.RegExSearch;
import home_work_6.search.api.ISearchEngine;
import home_work_6.search.api.decorators.SearchDecorator;
import home_work_6.search.api.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.search.api.decorators.SearchExcludingRegister;
import java.util.*;

import static home_work_6.Utils.FileUtils.readAllBytes;
import static home_work_6.Utils.ListTop.topWords;

public class CollectionMain {
    public static void main(String[] args) {
        String filePath = "src/home_work_6/files/Война и мир_книга.txt";
        String content = readAllBytes(filePath);

        String[] newContent = content.replaceAll("(\\p{Punct}|\\p{Space}|\\p{Graph}){1,}", " ").split(" ");

        List<String> words = new ArrayList<>();

        for (String word : newContent) {
            if(!word.isBlank()){
                words.add(word);
            }
        }

        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println("Кол-во использованных слов: " + uniqueWords.size());

        ISearchEngine searchEngine = new EasySearch();
        ISearchEngine searchEngine1 = new RegExSearch();

        System.out.println(searchEngine.search(content, "и"));
        System.out.println(searchEngine1.search(content, "и"));

//        topWords(words);
    }
}
