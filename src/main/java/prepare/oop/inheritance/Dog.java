package prepare.oop.inheritance;

import prepare.oop.Animal;

public class Dog extends Animal {
    //переопределение
    @Override
    public void voice() {
        System.out.println("Гав!");
    }
}
