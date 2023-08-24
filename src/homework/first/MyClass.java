package homework.first;

import java.util.Random;

public class MyClass {
    int year = 2023;

    static int sumOfTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int num1 = randomNumber.nextInt();
        int num2 = randomNumber.nextInt();
        System.out.println(sumOfTwoNumbers(num1, num2));
    }
}
