package homework.third;

public class FirstTask {

    public void findLongestWord(String firstWord, String secondWord, String thirdWord) {
        int firstLength = firstWord.length();
        int secondLength = secondWord.length();
        int thirdLength = thirdWord.length();

        if (firstLength > secondLength && firstLength > thirdLength) {
            System.out.println("The word '" + firstWord + "' is the longest");
        } else if (secondLength > firstLength && secondLength > thirdLength) {
            System.out.println("The word '" + secondWord + "' is the longest");
        } else {
            System.out.println("The word '" + thirdWord + "' is the longest");
        }
    }
}
