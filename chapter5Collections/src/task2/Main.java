package task2;

public class Main {
    public static void main(String[] args) {
        Garage<Vehicle> garage = new Garage<Vehicle>();
        Vehicle vehicle1 = new Car("Lamborghini"),
                vehicle2 = new Motorcycle("Harley-Davidson"),
                vehicle3 = new Car("Volkswagen"),
                vehicle4 = new Motorcycle("Kawasaki");
        String vehicle5 = new String("Not Vehicle");

//        try{
//            if(!(vehicle5 instanceof Vehicle))
//                throw new Exception("This is not vehicle");
//        }
//        catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }
        garage.setVehicle(vehicle1);
        garage.setVehicle(vehicle2);
        garage.setVehicle(vehicle3);
        garage.setVehicle(vehicle4);

        garage.getVehicles();
    }
}
