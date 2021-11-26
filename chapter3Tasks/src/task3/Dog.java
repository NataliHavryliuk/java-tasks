package task3;

public class Dog extends Animal {
    private boolean isHunter;

    Dog(String food, String location, boolean isHunter) {
        super(food, location);
        this.isHunter = isHunter;
    }

    @Override
    // Dog переопределяет методы makeNoise, eat.
    public void makeNoise(){
        System.out.println("Dog say \"Гав\"!");
    }
    public void eat(){
        System.out.println("Dog eat " + super.getFood());
    }
}
