package home_work_6;

import home_work_6.api.EasySearch;
import home_work_6.api.RegExSearch;
import home_work_6.comparator.MapValueComparator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        String filePath = "src/home_work_6/files/Война и мир_книга.txt";
        String[] separators = {",", ".", "?", "!", " -", "- ", ";", ":", "(", ")", "«", "»", "\n", "\t", "\r", "\""};

        String content = readAllBytesJava7(filePath);

        for (String separator : separators) {
            if(content.contains(separator)){
                content = content.replace(separator, " ");
            }
        }

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(content.split(" ")));
        List<String> words = new ArrayList<>(Arrays.asList(content.split(" ")));

        if(uniqueWords.contains("")){
            uniqueWords.removeAll(Collections.singleton(""));
        }
        if(words.contains("")){
            words.removeAll(Collections.singleton(""));
        }
//        topWords(uniqueWords, words);
        ISearchEngine searchEngine1 = new EasySearch();
//        ISearchEngine searchEngine2 = new RegExSearch();

//        System.out.println("Война: " + searchEngine1.search(content, "война"));
//        System.out.println("Война: " + searchEngine2.search(content, "война"));

        System.out.println("И c помощью EasySearch: " + searchEngine1.search(content, " и "));
//        System.out.println("И c помощью RegExSearch: " + searchEngine2.search(content, " и "));
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

    public static void topWords(Set<String> words, List<String> content){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = scanner.nextInt();

        Map<String, Integer> wordsCount = new HashMap<>();

        for (String word : words) {
            Integer count = 0;
            while (content.contains(word)){
                count++;
                content.remove(word);
            }
            wordsCount.put(word, count);
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordsCount.entrySet());
        MapValueComparator valueComparator = new MapValueComparator();
        sortedWords.sort(valueComparator);
        for (int i = 0; i < n; i++){
            System.out.println(sortedWords.get(i));
        }
    }
}
