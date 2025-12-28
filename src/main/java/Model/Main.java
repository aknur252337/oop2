package oop;

import oop.interfaces.IStudy;
import oop.interfaces.IWork;

public class Main {

    public static void main(String[] args) {

        // 7) Polymorphism: Human reference
        Human humanEmployee = new Employee(
                "Alex", 30, true, "Developer", 2000
        );

        humanEmployee.introduce();
        System.out.println(humanEmployee.getRole());

        // Class reference
        Student student = new Student(
                "Aida", 20, true, "AITU", 3.7
        );

        student.introduce();
        student.study();
        student.takeExam();
        student.showStudentInfo();
        System.out.println(student.getRole());

        // Interface reference IWork
        IWork worker = new Employee(
                "John", 40, true, "Manager", 3000
        );

        worker.work();
        System.out.println("Salary: " + worker.calculateSalary());

        // Interface reference IStudy
        IStudy studyingEmployee = new Employee(
                "Maria", 28, true, "QA Engineer", 1800
        );

        studyingEmployee.study();
        studyingEmployee.takeExam();
    }
}
