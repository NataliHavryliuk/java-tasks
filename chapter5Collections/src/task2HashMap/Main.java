package task2HashMap;

public class Main {
    public static void main(String[] args) {
        Garage<Vehicle, Owner> garage = new Garage<Vehicle, Owner>();
        Vehicle vehicle1 = new Car("Lamborghini", 455),
                vehicle2 = new Car("Lamborghini", 455),
                vehicle3 = new Motorcycle("Harley-Davidson", 84521),
                vehicle4 = new Motorcycle("Kawasaki", 74521);
        String vehicle5 = new String("Not Vehicle");

        Owner owner1 = new Owner("Mrs Smith"),
              owner2 = new Owner("Mr Brown"),
              owner3 = new Owner("Mr Taylor"),
              owner4 = new Owner("Mr Hall");

//        try{
//            if(!(vehicle5 instanceof Vehicle))
//                throw new Exception("This is not vehicle");
//        }
//        catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }

        if(!objectEquals(vehicle1, vehicle2))
            garage.setVehicle(vehicle2, owner2);
        System.out.println();
        garage.setVehicle(vehicle1, owner1);
        garage.setVehicle(vehicle3, owner3);
        garage.setVehicle(vehicle4, owner4);

        garage.getVehicles();
    }
    public static boolean objectEquals(Vehicle obj1, Vehicle obj2){
        System.out.println(obj1.getName() + " hashcode is " + obj1.hashCode());
        System.out.println(obj2.getName() + " hashcode is " + obj2.hashCode());
        if(obj1.equals(obj2)){
            System.out.println("Objects are equal");
            if (obj1.hashCode() == obj2.hashCode()){
                System.out.println("Absolutely equal");
                return true;
            }
            else {
                System.out.println("But hashcodes are not same");
                return false;
            }
        }
        else {
            System.out.println("Objects are not equal");
            return false;
        }
    }
}
