package home_work_6.search;

import home_work_6.search.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        String regex = "\\b" + word + "\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);

        return matcher.results().count();
    }
}
