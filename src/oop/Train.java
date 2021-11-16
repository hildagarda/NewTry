package oop;

public class Train {
    private String type;
    private String brand;
    private String color;


    public void move() {
        System.out.println("is moving");
    }

    public void stop() {
        System.out.println("is stopping");

    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return type + ' ' + brand + ' ' + color;
    }
}


