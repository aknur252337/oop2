import Model.Student;
import Model.Employee;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aknur", 18, "MT", 3.8);
        student.info();
        student.study();

        System.out.println();

        Employee employee = new Employee("Olzhas", 30, "Pilot", 750000);
        employee.info();
        employee.work();
    }
}