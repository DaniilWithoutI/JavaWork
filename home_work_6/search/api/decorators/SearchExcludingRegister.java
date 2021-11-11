package home_work_6.search.api.decorators;

import home_work_6.search.EasySearch;
import home_work_6.search.api.ISearchEngine;

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
