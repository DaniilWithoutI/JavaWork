package home_work_6;

import home_work_6.api.EasySearch;
import home_work_6.api.ISearchEngine;
import home_work_6.api.RegExSearch;
import home_work_6.api.decorators.SearchDecorator;
import home_work_6.api.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.api.decorators.SearchExcludingRegister;
import home_work_6.comparator.MapValueComparator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        String filePath = "src/home_work_6/files/Война и мир_книга.txt";
        String[] separators = {"!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<"
                , "=", ">", "?", "@", "[", "\\", "]", "^", "_", "`", "{", "|", "}", "~", "\n", "\r"};
        String content = readAllBytesJava7(filePath);

        /**
         * Вызвал интерфейс до очистки строки от символов, чтобы проверить декораторы.
         */
        ISearchEngine searchEngine1 = new EasySearch();
        ISearchEngine searchEngine2 = new RegExSearch();

        SearchExcludingRegister excludingRegister = new SearchExcludingRegister(searchEngine2);
        System.out.println("Проверка декоратора 1: " + excludingRegister.search(content, "очЕнЬ"));
        SearchEnginePunctuationNormalizer normalizer = new SearchEnginePunctuationNormalizer(excludingRegister);
        System.out.println("Проверка декоратора 2: " + normalizer.search(content, "очень"));
        System.out.println("Проверка декоратора 3: " + normalizer.search(content, "очЕнЬ"));

        System.out.println("Война: " + searchEngine1.search(content, "война"));
        System.out.println("Война c помощью RegExSearch: " + searchEngine2.search(content, "война"));

        System.out.println("И c помощью EasySearch: " + searchEngine1.search(content, "и"));
        System.out.println("И c помощью RegExSearch: " + searchEngine2.search(content, "и"));

        System.out.println("Мир c помощью EasySearch: " + searchEngine1.search(content, "мир"));
        System.out.println("Мир c помощью RegExSearch: " + searchEngine2.search(content, "мир"));

        for (String separator : separators) {
            if(content.contains(separator)){
                content = content.replace(separator, " ");
            }
        }

        List<String> words = new ArrayList<>(Arrays.asList(content.split(" ")));
        if(words.contains("")){
            words.removeAll(Collections.singleton(""));
        }
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Кол-во использованных слов: " + uniqueWords.size());

        topWords(words);
    }

    private static String readAllBytesJava7(String filePath) {
        String content = "";
        try{
            content = new String (Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }

    public static void topWords(List<String> words){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = scanner.nextInt();

        if(words.contains("")){
            words.removeAll(Collections.singleton(""));
        }

        Map<String, Integer> wordsCount = new HashMap<>();

        for (String word : words) {
            Integer count;
            if(!wordsCount.containsKey(word)){
                wordsCount.put(word, 1);
            } else{
                count = wordsCount.get(word);
                count++;
                wordsCount.put(word, count);
            }
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordsCount.entrySet());
        MapValueComparator valueComparator = new MapValueComparator();
        sortedWords.sort(valueComparator);
        for (int i = 0; i < n; i++){
            System.out.println(sortedWords.get(i));
        }
    }
}
