package oop;

public class Main {
    public static void main(String[] args) {
        // создал объект oop.Plan
        Plane airbus = new Plane();
        // хочу установить название бренда
        airbus.setBrand("Airbus");
        airbus.setType("Civil");
        airbus.setColor("Grey");
        System.out.println("first car: " + airbus);

        Car lada = new Car();

        lada.setBrand("Lada");
        lada.setType("Passenger");
        lada.setColor("White");
        System.out.println("second car: " + lada);

        Train sapsan = new Train();

        sapsan.setBrand("Sapsan");
        sapsan.setType("Electric");
        sapsan.setColor("Rad");
        System.out.println("third car: " + sapsan);

    }
}
