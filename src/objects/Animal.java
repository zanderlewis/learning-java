package dev.zanderlewis.learn.objects;
import dev.zanderlewis.learn.Utilities;

public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        Utilities.negCheck("Age", age);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
