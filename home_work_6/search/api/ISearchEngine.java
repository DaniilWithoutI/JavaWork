package home_work_6.search.api;

public interface ISearchEngine {
    /**
     * ищет слово в тексте
     * @param text текст
     * @param word искомое слово
     * @return количество найденных вхождений
     */
    long search(String text, String word);
}
