package home_work_1;

import home_work_1.api.ICommunicationPrinter;

public class NamesWithSwitchFind implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        switch (name) {
            case "Вася":
            case "Анастасия":
                return "Привет!\nЯ тебя так долго ждал.";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
