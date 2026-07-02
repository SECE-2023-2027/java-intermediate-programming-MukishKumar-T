package VehiclePolymorphism;

class Vehicle {
    private String vehicleNo;
    private String vehicleName;

    public Vehicle(){}

    public Vehicle(String vehicleNo, String vehicleName){
        this.vehicleNo = vehicleNo;
        this.vehicleName = vehicleName;
    }

    public String startEngine(){
        return "Vehicle Engine Started";
    }
}
