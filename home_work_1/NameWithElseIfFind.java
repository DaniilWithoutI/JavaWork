package home_work_1;

import home_work_1.api.ICommunicationPrinter;

public class NameWithElseIfFind implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        if("Вася".equals(name)){
            return "Привет!\nЯ тебя так долго ждал.";
        } else if("Анастасия".equals(name)){
            return "Привет!\nЯ тебя так долго ждал.";
        } else{
            return "Добрый день, а вы кто?";
        }
    }
}
