package homework.fifth;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog("Lucky");
        Cat cat = new Cat("Lily");

        System.out.println("Dog has " + dog.raw + " paw");
        cat.sleep();
    }
}
