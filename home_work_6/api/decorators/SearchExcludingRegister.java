package home_work_6.api.decorators;

import home_work_6.api.EasySearch;
import home_work_6.api.ISearchEngine;
import home_work_6.api.RegExSearch;

import java.util.Locale;

public class SearchExcludingRegister implements ISearchEngine{

    private final ISearchEngine searchEngine;

    public SearchExcludingRegister(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
            word = word.toLowerCase();
            text = text.toLowerCase();
        return this.searchEngine.search(text, word);
    }
}
