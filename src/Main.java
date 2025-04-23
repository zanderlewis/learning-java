package dev.zanderlewis.learn;

import dev.zanderlewis.learn.classone.ClassOne;
import dev.zanderlewis.learn.classtwo.ClassTwo;
import dev.zanderlewis.learn.Person;
import dev.zanderlewis.learn.Utilities;

public class Main {
    public static void main(String[] args) {
        ClassOne.oneMethod();
        ClassTwo.twoMethod();

        Utilities.printDivider();
        
	    Utilities.print("Amazing! RSJ works!");

        Utilities.printDivider();

        Person person = new Person("Zander", "Lewis", 16, "white");
        Utilities.print("Name: " + person.getName());
        Utilities.print("Age: " + person.getAge());
        Utilities.print("First Name: " + person.getFirstName());
        Utilities.print("Last Name: " + person.getLastName());
        Utilities.print("Skin Color: " + person.getSkinColor());
    }
}
