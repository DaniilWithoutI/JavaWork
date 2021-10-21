package home_work_6.api;

import home_work_6.ISearchEngine;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private long count = 0;
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            count++;
            text = matcher.replaceFirst("");
            search(text, word);
        }
        return count;
    }
}
