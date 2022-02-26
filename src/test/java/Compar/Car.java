package Compar;

public class Car implements Comparable<Car>{

    private int manufactureYear;
    private String model;
    private int maxSpeed;

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car o) {
        return this.getManufactureYear() - o.getManufactureYear();
    }

    //...геттеры, сеттеры, toString()
}
