package home_work_6.Utils;

import home_work_6.comparator.MapValueComparator;

import java.util.*;

public class ListTop {
    private ListTop() {throw new IllegalStateException("Utility class");}

    /**
     * выводит топ по количеству использования слов
     * @param words коллекция слов
     */
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
