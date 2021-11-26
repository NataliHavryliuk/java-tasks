package task3;

public class VetDoctor {

    public static void treatAnimal(Animal animal){
        System.out.println("Vet doctor treats " + animal.getClass().getSimpleName() + " which eat " +
                animal.getFood() + " and lives in "+ animal.getLocation() );
    }
}
