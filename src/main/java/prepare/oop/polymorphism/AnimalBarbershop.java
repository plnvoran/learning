package prepare.oop.polymorphism;

import prepare.oop.Animal;

public class AnimalBarbershop {
    public void shear(Animal animal) {
        System.out.println("Стрижка готова!");
        animal.voice();
    }
}