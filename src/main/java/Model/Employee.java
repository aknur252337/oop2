package oop;

import oop.interfaces.IStudy;
import oop.interfaces.IWork;

public class Employee extends Human implements IWork, IStudy {

    private String position;
    private double salary;

    public Employee(String name, int age, boolean isAlive,
                    String position, double salary) {
        super(name, age, isAlive);
        this.position = position;
        this.salary = salary;
    }

    // interface IWork
    @Override
    public void work() {
        System.out.println(name + " is working as " + position);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    // interface IStudy
    @Override
    public void study() {
        System.out.println(name + " is studying while working");
    }

    @Override
    public void takeExam() {
        System.out.println(name + " passed a professional exam");
    }

    // abstract method implementation
    @Override
    public String getRole() {
        return "I am an employee";
    }
}
