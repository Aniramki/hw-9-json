package countClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Counter {

    public static void main(String[] str) throws IOException {
        //берем файл
        File file = new File("./words.txt");
        //Читаем все байты из файла и пихаем их в стринг. Теперь в стринге весь файл
        String fileData = new String(new FileInputStream(file).readAllBytes());

        //Тут будут слова и их количество
        Map<String, Integer> map = new HashMap<>();

        //Получаем все слова разделенные прбелами и переносом строки(перенос на Виндовс и перенос на Линукс)
        String[] words = fileData.split(" |\\n|\\r\\n");
        //Засовываем слова с количеством в мапу
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        //Берем все слова и пихаем в лист
        List<String> result = new ArrayList<>(map.keySet());

        result.sort(new Comparator<String>() {
            @Override
            public int compare(String firstWord, String secondWord) { //compare знает, что firstWord - это 1е значение result (ключ мапы)
                Integer secondWordCount = map.get(secondWord);
                Integer firstWordCount = map.get(firstWord); //достать значение мапы по ключу firstWord
                return secondWordCount.compareTo(firstWordCount);
            }
        });

        //Выводим на консоль
        for (String s : result) {

            System.out.println(s + " - " + map.get(s));
        }
    }

}