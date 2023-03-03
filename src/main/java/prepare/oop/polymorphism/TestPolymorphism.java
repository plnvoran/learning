package prepare.oop.polymorphism;

import prepare.oop.inheritance.Cat;
import prepare.oop.inheritance.Dog;

public class TestPolymorphism {
    public static void main(String[] args) {
        Dog dog= new Dog();
        Cat cat = new Cat();

        AnimalBarbershop  animalBarbershop = new AnimalBarbershop();
        animalBarbershop.shear(dog);
        animalBarbershop.shear(cat);

    }
}
