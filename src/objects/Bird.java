package dev.zanderlewis.learn.objects;

import dev.zanderlewis.learn.objects.Animal;

public class Bird extends Animal {
    private String species;

    public Bird(String name, int age, String color, String species) {
        super(name, age, color);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
