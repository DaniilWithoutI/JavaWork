package home_work_1.api;

public interface ICommunicationPrinter {
    /**
     * Возвращает ответ в зависимости от переданной переменной
     * @param name имя
     * @return "Привет!\nЯ тебя так долго ждал."
     *          "Добрый день, а вы кто?"
     */
    String welcome(String name);
}
