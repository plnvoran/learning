package prepare.oop.encapsulation;

public class Man {

    int age;
    int weigh;

    public void voice() {
        System.out.println("Голос!");
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
