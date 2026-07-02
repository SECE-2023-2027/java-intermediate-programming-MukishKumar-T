package VehiclePolymorphism;

class Car extends Vehicle {
    public Car(){}

    public Car(String vehicleNo, String vehicleName){
        super(vehicleNo, vehicleName);
    }

    @Override
    public String startEngine(){
        return "Car Engine Started";
    }
}
