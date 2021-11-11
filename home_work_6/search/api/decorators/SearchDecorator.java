package home_work_6.search.api.decorators;

import home_work_6.search.api.ISearchEngine;

public abstract class SearchDecorator implements ISearchEngine {
    ISearchEngine searchEngine;

    protected SearchDecorator(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
}