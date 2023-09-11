package homework.fifth;

public class Animal {
    protected int eyes;

    public Animal() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    public String name;
    protected int tail = 1;
    protected int raw = 4;

    public Pet() {
        super();
        System.out.println("I am pet");
        eyes = 2;
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet runs« jumps");
    }
}

class Dog extends Pet {

    public Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    public Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
