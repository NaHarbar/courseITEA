package homework.seventh;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FirstTaskClass {

    public static void main(String[] args) {
        List<Integer> list = generateArray();
        divideArray(list);
    }

    public static List<Integer> generateArray() {
        Random random = new Random();
        int randomLength = random.nextInt(1, 50);
        List<Integer> array = new ArrayList<>(randomLength);

        for (int i = 0; i < randomLength; i++) {
            array.add(random.nextInt(0, 1000));
        }
        System.out.println(array);
        return array;
    }

    public static List<Integer> divideArray(List<Integer> array) {
        Random random = new Random();
        int randomDivider = random.nextInt(-10, 10);
        List<Integer> divideArray = new ArrayList<>();

        for (int i : array) {
            try {
                int result = i / randomDivider;
                divideArray.add(result);
            } catch (ArithmeticException e) {
                System.out.println("Dividing by 0");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("That index doesn't exist");
            }
        }

        System.out.println("Updated list: " + divideArray + " divided to " + randomDivider);
        return divideArray;
    }
}
