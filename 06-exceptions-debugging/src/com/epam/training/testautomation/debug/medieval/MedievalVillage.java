package com.epam.training.testautomation.debug.medieval;

import java.util.ArrayList;
import java.util.List;

public class MedievalVillage {
    private static final String NAME_OF_OUR_KING = "Jon Snow";

    private static int numberOfVillages;

    private List<Citizen> citizens = new ArrayList<>();
    private List<Building> buildings = new ArrayList<>();

    private String name;
    private int population;

    private MedievalVillage(String name) {
        this.name = name;
        numberOfVillages++;
    }

    private void addCitizen(Citizen citizen) {
        citizens.add(citizen);
        population++;
    }

    private void addBuilding(Building building) {
        buildings.add(building);
    }

    @Override
    public String toString() {
        return "MedievalVillage{" +
                "\n  name='" + name + '\'' +
                "\n  population=" + population +
                "\n  citizens=" + citizens +
                "\n  buildings=" + buildings +
                "\n}";
    }

    public static void main(String... args) {
        // Create villages
        MedievalVillage dustville = new MedievalVillage("Dustville");
        MedievalVillage beerland = new MedievalVillage("Beerland");
        MedievalVillage oakenshield = new MedievalVillage("Oakenshield");

        // Create citizens
        Citizen peter = new Citizen("Peter");
        Citizen jessie = new Citizen("Jessie");
        Citizen john = new Citizen("John");
        Citizen sarah = new Citizen("Sarah");
        Citizen maya = new Citizen("Maya");
        Citizen adam = new Citizen("Adam");
        Citizen alex = new Citizen("Alex");
        Citizen monica = new Citizen("Monica");
        Citizen sheldon = new Citizen("Sheldon");
        Citizen maria = new Citizen("Maria");

        // Create buildings
        Building mill = new Building("Beerland Mill", "mill", peter);
        Building tavern = new Building("Don't war drink beer", "tavern", jessie);
        Building shop = new Building("Oakenshild *Town* Shop", "shop", adam);

        // Add buildings to villages
        beerland.addBuilding(mill);
        beerland.addBuilding(tavern);
        oakenshield.addBuilding(shop);

        // Add citizens to villages
        dustville.addCitizen(john);
        dustville.addCitizen(sarah);
        beerland.addCitizen(peter);
        beerland.addCitizen(jessie);
        beerland.addCitizen(maya);
        oakenshield.addCitizen(adam);
        oakenshield.addCitizen(alex);
        oakenshield.addCitizen(monica);
        oakenshield.addCitizen(sheldon);
        oakenshield.addCitizen(maria);

        // Print villages
        System.out.println("Who's our true king? " + NAME_OF_OUR_KING);
        System.out.println("How many villages we have? " + numberOfVillages);
        System.out.println();

        System.out.println("Dustville:");
        System.out.println(dustville);
        System.out.println();

        System.out.println("Beerland:");
        System.out.println(beerland);
        System.out.println();

        System.out.println("Oakenshield:");
        System.out.println(oakenshield);
        System.out.println();

    }
}
