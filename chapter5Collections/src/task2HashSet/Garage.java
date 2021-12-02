package task2HashSet;

import java.util.HashSet;

public class Garage<T extends Vehicle> {
    private HashSet<T> vehicles = new HashSet<>();

    public HashSet<T> getVehicles(){
        System.out.println("Vehicles were added in garage: ");
        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle.getName());
        }
        return vehicles;
    }
    public void setVehicle(T vehicle){
        this.vehicles.add(vehicle);
    }
}
