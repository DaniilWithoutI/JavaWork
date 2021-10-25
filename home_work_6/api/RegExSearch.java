package home_work_6.api;

import home_work_6.api.decorators.SearchDecorator;
import home_work_6.api.decorators.SearchExcludingRegister;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    public long search(String text, String word) {
        String regex = "\\b" + word + "\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        return matcher.results().count();
    }
}
