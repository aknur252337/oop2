package Model;

import Interfaces.IWork;

public class Employee extends Human implements IWork {

    private String position;
    private double salary;
    public Employee(String name, int age, String position, double salary) {
        super(name, age);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " work in a position " + position);
    }

    @Override
    public void info() {
        System.out.println("Employee: " + name + ", Age: " + age + ", Position: " + position + ", Salary: " + salary);
    }
}