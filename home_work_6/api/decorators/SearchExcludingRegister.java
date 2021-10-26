package home_work_6.api.decorators;

import home_work_6.api.EasySearch;
import home_work_6.api.ISearchEngine;

import java.util.regex.Pattern;

public class SearchExcludingRegister extends SearchDecorator{

    public SearchExcludingRegister(ISearchEngine searchEngine) {
        super(searchEngine);
    }

    @Override
    public long search(String text, String word) {
        if(searchEngine instanceof EasySearch){
            word = word.toLowerCase();
            text = text.toLowerCase();
        } else{
            word = "(?i)" + word;
        }
        return this.searchEngine.search(text, word);
    }
}
