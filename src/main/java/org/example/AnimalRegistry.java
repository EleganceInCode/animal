package org.example;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getAge() + " лет, команды: " + animal.getCommands());
        }
    }
}
