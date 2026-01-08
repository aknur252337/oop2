package Model;

import Interfaces.IStudy;

public class Student extends Human implements IStudy {

    private String major;
    private double gpa;

    public Student(String name, int age, String major, double gpa) {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public void study() {
        System.out.println(name + " is study in " + major);
    }

    @Override
    public void info() {
        System.out.println("Student: " + name + ", Age: " + age + ", Specialization: " + major + ", GPA: " + gpa);
    }
}