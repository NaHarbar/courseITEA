package homework.fourth;

public class Student {
    String studentFirstName;
    String studentLastName;
    double mathGrade;
    double economicGrade;
    double foreignLanguageGrade;
    int studentID;
    int course;

    public Student(int studentID, String studentFirstName, String studentLastName, int course, double mathGrade, double economicGrade, double foreignLanguageGrade) {
        this.studentID = studentID;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.course = course;
        this.mathGrade = mathGrade;
        this.economicGrade = economicGrade;
        this.foreignLanguageGrade = foreignLanguageGrade;
    }

    public void calculateAverageGrade() {
        double average = (mathGrade + economicGrade + foreignLanguageGrade) / 3;
        System.out.println("Student " + studentFirstName + " " + studentLastName + " has average grade: " + average);
    }

}
