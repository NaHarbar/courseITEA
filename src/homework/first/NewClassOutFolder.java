package homework.first;

import homework.fourth.Employee;

public class NewClassOutFolder {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ewart");
        Employee employee2 = new Employee("Goodwin");
        Employee employee3 = new Employee("Rix");
        employee1.showInfo(employee1.surname);
        employee2.showInfo(employee2.surname);
        employee3.showInfo();
    }
}
