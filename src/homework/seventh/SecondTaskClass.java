package homework.seventh;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTaskClass {

    public static void main(String[] args) {

        List<String> list = createList();
        checkNumber(list);
    }

    public static void checkNumber(List<String> list) {
        String regex = "^\\+380\\d{9}$";

        Pattern pattern = Pattern.compile(regex);
        for (String number : list) {
            Matcher matcher = pattern.matcher(number);
            System.out.println("Number: " + number + " is " + matcher.matches());
        }
    }

    public static List<String> createList() {
        List<String> numbers = new ArrayList<>();
        numbers.add("+3786074532");
        numbers.add("786074532");
        numbers.add("+380786074532");
        numbers.add("+360186044512");
        numbers.add("380613213134");
        numbers.add("+380613213134");
        return numbers;
    }
}
