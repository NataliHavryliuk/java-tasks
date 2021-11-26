package task3;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("fish", "flat", true),
                new Dog("meat", "house", true),
                new Horse("hay", "barn", 735.5)
        };

        for (Animal animal : animals){
            VetDoctor.treatAnimal(animal);
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            System.out.println();
        }
    }
}
