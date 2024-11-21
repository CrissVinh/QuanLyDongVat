package QuanLyDongVat;

import java.util.ArrayList;

public class AnimalList {

    private ArrayList<Animal> animals;

    public AnimalList() {
        this.animals = new ArrayList<>();

    }

    public void addAnimal(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println(" them mot Dog: " + animal);
            System.out.println("");
        } else if (animal instanceof Cat) {
            System.out.println(" them mot Cat: " + animal);
            System.out.println("");
        }
        animals.add(animal);

    }

    public void displayAll() {
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
        }
    }

}
