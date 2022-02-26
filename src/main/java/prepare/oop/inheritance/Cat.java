package prepare.oop.inheritance;

import prepare.oop.Animal;

public class Cat extends Animal {
    //переопределение
    @Override
    public void voice() {
        System.out.println("Мяу!");
    }
}
