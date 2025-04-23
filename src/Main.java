package dev.zanderlewis.learn;

import dev.zanderlewis.learn.objects.*; // Classes: [ Person, Animal, Dog, Cat, Bird ]
import dev.zanderlewis.learn.Utilities; // Helper class

public class Main {
    public static void main(String[] args) {
        // Call the print method from Utilities
	    Utilities.print("Amazing! RSJ works!");

        // Print Divider
        Utilities.printDivider();

        // Create a new Person object
        Person person = new Person("Zander", "Lewis", 16, "white");
        Utilities.print("Name: " + person.getName());
        Utilities.print("Age: " + person.getAge());
        Utilities.print("First Name: " + person.getFirstName());
        Utilities.print("Last Name: " + person.getLastName());
        Utilities.print("Skin Color: " + person.getSkinColor());

        // Print Divider
        Utilities.printDivider();

        // Set new values
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setSkinColor("black");
        person.setAge(30);
        Utilities.print("Updated Name: " + person.getName());
        Utilities.print("Updated Age: " + person.getAge());
        Utilities.print("Updated First Name: " + person.getFirstName());
        Utilities.print("Updated Last Name: " + person.getLastName());
        Utilities.print("Updated Skin Color: " + person.getSkinColor());

        // Print Divider
        Utilities.printDivider();

        // Animal objects
        Animal dog = new Dog("Buddy", 5, "brown", "Labrador");
        Animal cat = new Cat("Whiskers", 3, "white", "Persian");
        Animal bird = new Bird("Tweety", 1, "yellow", "Canary");

        // Print Dog details
        Utilities.print("Dog Name: " + dog.getName());
        Utilities.print("Dog Age: " + dog.getAge());
        Utilities.print("Dog Color: " + dog.getColor());
        Utilities.print("Dog Breed: " + ((Dog) dog).getBreed());

        // Print Divider
        Utilities.printDivider();

        // Print Cat details
        Utilities.print("Cat Name: " + cat.getName());
        Utilities.print("Cat Age: " + cat.getAge());
        Utilities.print("Cat Color: " + cat.getColor());
        Utilities.print("Cat Breed: " + ((Cat) cat).getBreed());

        // Print Divider
        Utilities.printDivider();

        // Print Bird details
        Utilities.print("Bird Name: " + bird.getName());
        Utilities.print("Bird Age: " + bird.getAge());
        Utilities.print("Bird Color: " + bird.getColor());
        Utilities.print("Bird Species: " + ((Bird) bird).getSpecies());
    }
}
