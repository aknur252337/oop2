package oop;

public abstract class Human {

    // 6) protected fields
    protected String name;
    protected int age;
    protected boolean isAlive;

    // constructor
    public Human(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    // common method
    public void introduce() {
        System.out.println("Hi, my name is " + name + ", I am " + age + " years old.");
    }

    // 4) abstract method
    public abstract String getRole();

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
