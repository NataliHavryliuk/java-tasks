package task2;
import java.util.ArrayList;

public class Garage<T extends  Vehicle> {
    private ArrayList<T> vehicles = new ArrayList<>();

    public ArrayList<T> getVehicles(){
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
