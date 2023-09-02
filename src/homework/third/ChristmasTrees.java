package homework.third;

public class ChristmasTrees {

    public void firstTree() {
        System.out.println("This is a first Christmas Tree");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i > 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void secondTree() {
        System.out.println("This is a second Christmas Tree");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void thirdTree() {
        System.out.println("This is a third Christmas Tree");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

