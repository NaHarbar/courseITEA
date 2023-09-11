package homework.fourth;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student(12, "Alex", "Smith", 2, 6.7, 7.5, 8.3);
        Student student2 = new Student(9, "Bill", "White", 3, 9.5, 5.4, 6.7);
        Student student3 = new Student(8, "Leo", "Lee", 5, 7.4, 8.6, 9.2);

        student1.calculateAverageGrade();
        student2.calculateAverageGrade();
        student3.calculateAverageGrade();
    }
}
