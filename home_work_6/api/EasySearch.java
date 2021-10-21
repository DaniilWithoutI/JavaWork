package home_work_6.api;

import home_work_6.ISearchEngine;

import java.util.Arrays;

public class EasySearch implements ISearchEngine {
    public long search(String text, String word){
        long count = 0;
        int i = -1;
        while (text.indexOf(word, i + 1) != -1) {
            i = text.indexOf(word, i + 1);
            count++;
        }
        return count;
    }
}
