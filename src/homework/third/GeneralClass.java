package homework.third;

import java.util.Random;

public class GeneralClass {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int month = randomNumber.nextInt(1, 12);

        new FirstTask().findLongestWord("Lorem", "Reprehenderit", "Excepteur");
        new Month().showNumberOfDaysInMonth(month);
        ChristmasTrees christmasTrees = new ChristmasTrees();
        christmasTrees.firstTree();
        christmasTrees.secondTree();
        christmasTrees.thirdTree();
    }
}
