package home_work_6.api.decorators;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer extends SearchDecorator{
    private final String[] separators = {"!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<"
            , "=", ">", "?", "@", "[", "\\", "]", "^", "_", "`", "{", "|", "}", "~", "\n", "\r"};

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        super(searchEngine);
    }

    @Override
    public long search(String text, String word) {
        for (String separator : separators) {
            if(text.contains(separator)){
                text = text.replace(separator, " ");
            }
        }
        return this.searchEngine.search(text, word);
    }
}
