package homework.fifth;

import java.util.Random;

public class TestStudent{

    private static double generateRandomGrade(){
        Random random = new Random();
        double start = 1;
        double end = 10;
        return start + (random.nextDouble() * (end - start));
    }

    private static int generateRandomCourse(){
        Random random = new Random();
        return random.nextInt(1, 5);
    }

    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();

        firstStudent.setName("David Sanchez");
        firstStudent.setCourse(generateRandomCourse());
        firstStudent.setGrade(generateRandomGrade());

        secondStudent.setName("Stephanie Steele");
        secondStudent.setCourse(generateRandomCourse());
        secondStudent.setGrade(generateRandomGrade());

        thirdStudent.setName("Michael Ball");
        thirdStudent.setCourse(generateRandomCourse());
        thirdStudent.setGrade(generateRandomGrade());

        firstStudent.showInfo();
        secondStudent.showInfo();
        thirdStudent.showInfo();
    }
}
