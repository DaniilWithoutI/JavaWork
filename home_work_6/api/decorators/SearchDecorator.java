package home_work_6.api.decorators;

import home_work_6.api.ISearchEngine;

public class SearchDecorator implements ISearchEngine {
    ISearchEngine searchEngine;

    public SearchDecorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public long search(String text, String word) {
        return this.searchEngine.search(text, word);
    }
}