package task2HashMap;

import java.util.HashMap;
import java.util.Map;

public class Garage<V extends Vehicle, O extends Owner> {
//    private HashMap<V, O> vehicles = new HashMap<>();
    private Map<V, O> vehicles = new HashMap<V, O>();

    public Map<V, O> getVehicles(){
        for (Map.Entry<V, O> item : vehicles.entrySet()){
            System.out.println(item.getValue().getName() + " left " + item.getKey().getName() + " with number  " + item.getKey().getNumber() + " in garage");
        }
        return vehicles;
    }
    public void setVehicle(V vehicle, O owner){
        this.vehicles.put(vehicle, owner);
    }
}
