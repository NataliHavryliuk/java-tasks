package task3;

public class Cat extends Animal{
    private boolean canClimbing;

    Cat(String food, String location, boolean canClimbing) {
        super(food, location);
        this.canClimbing = canClimbing;
    }

    @Override
    // Cat переопределяет методы makeNoise, eat.
    public void makeNoise(){
        System.out.println("Cat say \"Мяу\"!");
    }
    public void eat(){
        System.out.println("Cat eat " + super.getFood());
    }
}
