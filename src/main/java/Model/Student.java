package oop;

import oop.interfaces.IStudy;

public final class Student extends Human implements IStudy {

    // 5) final field
    private final String university;

    private double gpa;

    public Student(String name, int age, boolean isAlive,
                   String university, double gpa) {
        super(name, age, isAlive);
        this.university = university;
        this.gpa = gpa;
    }

    public String getUniversity() {
        return university;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // implementation of interface methods
    @Override
    public void study() {
        System.out.println(name + " is studying at " + university);
    }

    @Override
    public void takeExam() {
        System.out.println(name + " is taking an exam");
    }

    // overridden abstract method
    @Override
    public String getRole() {
        return "I am a student";
    }

    // 5) final method
    public final void showStudentInfo() {
        System.out.println("Student: " + name + ", GPA: " + gpa);
    }
}
