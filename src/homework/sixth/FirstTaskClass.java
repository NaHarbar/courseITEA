package homework.sixth;

public class FirstTaskClass {

    public static void findMinDifference(int[] array) {
        int minDifference = Math.abs(array[0] - array[1]);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int difference = Math.abs(array[i] - array[j]);
                minDifference = Math.min(minDifference, difference);
            }
        }
        System.out.println(minDifference);
    }

    public static void main(String[] args) {
        int[] array = {5, 11, 7, 20};
        findMinDifference(array);
    }
}
