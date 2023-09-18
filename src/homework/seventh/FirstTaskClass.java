package homework.seventh;

import java.util.Random;

public class FirstTaskClass {

    public static void main(String[] args) {
        int[] list = generateArray();
        divideArray(list);
    }

    public static int[] generateArray() {
        Random random = new Random();
        int randomLength = random.nextInt(1, 50);
        int[] array = new int[randomLength];

        for (int i = 0; i < randomLength; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void divideArray(int[] array) {
        Random random = new Random();
        int randomDivider = random.nextInt(-10, 10);
        int[] divideArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            try {
                int result = array[i] / randomDivider;
                divideArray[i] = result;
            } catch (ArithmeticException e) {
                System.out.println("Dividing by 0");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("That index doesn't exist");
            } finally {
                System.out.println(divideArray[i]);
            }
        }

        System.out.println("Updated list: " + divideArray + " divided to " + randomDivider);
    }
}
