package dev.zanderlewis.learn;

public class Person {
    private String fname;
    private String lname;
    private int age;
    private String color;

    public Person(String fname, String lname, int age, String color) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return fname + " " + lname;
    }

    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }

    public String getSkinColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String fname) {
        this.fname = fname;
    }

    public void setLastName(String lname) {
        this.lname = lname;
    }

    public void setSkinColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age; 
        } else {
            System.out.println("Age can't be negative!");
        }
    }
}