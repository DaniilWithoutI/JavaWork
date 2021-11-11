package home_work_6.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {
    private FileUtils() {throw new IllegalStateException("Utility class");}

    /**
     * читает текст из файла
     * @param filePath путь к файлу
     * @return найденный текст в формате строки
     */
    public static String readAllBytes(String filePath) {
        String content = "";
        try{
            content = new String (Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }
}
