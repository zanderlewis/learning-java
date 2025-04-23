package dev.zanderlewis.learn.objects;

import dev.zanderlewis.learn.objects.Animal;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
