package homework.fourth;

public class FirstNewClassInFolder {

    public static void main(String[] args) {
        Employee employee1 = new Employee(34513, "Jenkins");
        Employee employee2 = new Employee("Frost");

        employee1.showInfo(employee1.id);
        employee2.showInfo(employee2.surname);
    }
}
