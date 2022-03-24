package com.epam.training.testautomation;

import com.epam.training.testautomation.animals.Cat;
import com.epam.training.testautomation.animals.Dog;
import com.epam.training.testautomation.animals.Pet;
import com.epam.training.testautomation.collections.Brainstorming;
import com.epam.training.testautomation.collections.CountryCodes;
import com.epam.training.testautomation.collections.TelephoneBook;
import com.epam.training.testautomation.products.Car;
import com.epam.training.testautomation.products.Plane;
import com.epam.training.testautomation.products.VacuumCleanerRobot;

public class Test {

    public static void main(String[] args) {

        /* Homework Task 3: You can implement the steps here. */

        /* Homework Task 4: You can try out your implementation by running these lines. */
        TelephoneBook hunTelBook = new TelephoneBook(CountryCodes.HUNGARY.getCode());
        hunTelBook.add("Lajos Kovacs", "301111111");
        hunTelBook.add("Pal Toth", "302222222");
        hunTelBook.add("Maria Molnar", "303333333");
        hunTelBook.add("Steve Jobbs", "304444444");
        hunTelBook.add("Steve Jobs", "304444444");  // Correcting the name
        hunTelBook.remove("303333333");
        hunTelBook.remove("705555555");
        hunTelBook.printBook();
        System.out.println();

        /* Homework Task 5: You can try out your implementation by running these lines. */
        Brainstorming ideasForHalloween = new Brainstorming();
        ideasForHalloween.addIdea("Cherry juice as blood");
        ideasForHalloween.addIdea("Fluorescent plastic skeletons");
        ideasForHalloween.addIdea("Vampiric music");
        ideasForHalloween.addIdea("Fluorescent plastic skeletons"); // Duplicated
        ideasForHalloween.removeIdea("Vampiric music");
        System.out.println("We have this amount of ideas: " + ideasForHalloween.getNumberOfIdeas());
        System.out.println(ideasForHalloween.toString());
        System.out.println();

        /* Homework Task 6-8: You can try out your implementation by running these lines. */
        Cat narancs = new Cat("Nari");
        System.out.println(narancs.toString());
        narancs.makeSound();
        narancs.lookForMice();
        System.out.println();

        Pet omlas = new Cat("Omlas");
        System.out.println(omlas.toString());
        omlas.makeSound();
        // omlas.lookForMice();             // Think about why you cannot use this method this way, and...
        ((Cat) omlas).lookForMice();        // you why need to do casting here?
        System.out.println();

        Dog firstDogInSpace = new Dog("Lajka");
        System.out.println(firstDogInSpace.toString());
        firstDogInSpace.makeSound();
        System.out.println();

    }

}
