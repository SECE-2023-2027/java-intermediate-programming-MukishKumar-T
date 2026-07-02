package VehiclePolymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println(v.startEngine());
        System.out.println(car.startEngine());
        System.out.println(motorcycle.startEngine());
    }
}
