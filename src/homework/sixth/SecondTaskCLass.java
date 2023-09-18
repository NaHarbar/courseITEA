package homework.sixth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondTaskCLass {

    public static Map<Integer, String> createBookMap(List<String> list) {
        Map<Integer, String> bookMap = new HashMap<>();
        int i = 0;
        for (String book : list) {
            bookMap.put(i++, book);
        }
        return bookMap;
    }

    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("Сім чоловіків Евелін Г'юґо");
        bookList.add("Танці з кістками");
        bookList.add("Найкоротша історія часу");
        bookList.add("Останній дім на безпечній вулиці");
        bookList.add("Тамплієри. Народження та загибель ордену");

        System.out.println(createBookMap(bookList));
    }
}
