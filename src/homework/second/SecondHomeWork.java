package homework.second;

import java.util.Random;
import java.util.Scanner;

public class SecondHomeWork {

    public static Integer checkInputProperties(Integer number) {
        int firstDigit = number / 100 % 10;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;
        return firstDigit + secondDigit + thirdDigit;
    }

    public static Integer checkInputProperties(String firstWord, String secondWord) {
        int firstLength = firstWord.length();
        int secondLength = secondWord.length();
        return firstLength + secondLength;
    }

    public static boolean checkInputProperties() {
        Scanner keyboardNumber = new Scanner(System.in);
        System.out.print("Enter any number and press Enter:");
        int number = keyboardNumber.nextInt();
        keyboardNumber.close();

        if (number > 0) {
            System.out.println("The number is greater than 0.");
            return true;
        } else {
            System.out.println("The number is less than 0.");
            return false;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100, 999);
        String firstWord = "Lorem";
        String secondWord = "Random";

        System.out.println("Sum of digits of " + randomNumber + " is equal to: " + checkInputProperties(randomNumber));
        System.out.println("Sum of lengths of " + firstWord + " and " + secondWord + " is: " + checkInputProperties(firstWord, secondWord));
        System.out.println(checkInputProperties());
    }
}
