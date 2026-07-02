package VehiclePolymorphism;

class Motorcycle extends Vehicle {
    public Motorcycle(){}

    public Motorcycle(String vehicleNo, String vehicleName){
        super(vehicleNo, vehicleName);
    }

    @Override
    public String startEngine(){
        return "Motorcycle Engine Started";
    }
}
