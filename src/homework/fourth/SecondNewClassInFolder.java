package homework.fourth;

public class SecondNewClassInFolder {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1235, "Brown");
        Employee employee2 = new Employee("Kennedy");

        employee1.showInfo(employee1.id);
        employee2.showInfo(employee2.surname);
    }
}
