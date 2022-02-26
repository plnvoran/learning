package prepare.oop.inheritance;

import prepare.oop.Animal;
import prepare.oop.inheritance.Cat;
import prepare.oop.inheritance.Dog;

public class TestInheritance {
    public static void main(String[] args) {
        Dog dog= new Dog();
        Cat cat = new Cat();

        dog.voice();
        cat.voice();
    }
}
