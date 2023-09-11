package homework.fourth;

public class Employee {
    public String surname;
    int id;
    private int salary;

    public Employee(String surname) {
        this.surname = surname;
    }

    Employee(int id, String surname) {
        new Employee(surname);
        this.id = id;
    }

    private Employee(int id, String surname, int salary) {
        this.salary = salary;
    }

    public void showInfo(String surname) {
        System.out.println("Employee surname is " + surname);
    }

    public void showInfo(int id) {
        System.out.println("Employee ID is " + id);
    }

    public void showInfo() {
        System.out.println("Employee " + surname + " with is " + id + " has salary - " + salary);
    }

}
