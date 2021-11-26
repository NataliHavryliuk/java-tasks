package task3;

public class Horse extends  Animal {
    private double power;

    Horse(String food, String location, double power) {
        super(food, location);
        this.power = power;
    }

    @Override
    // Horse переопределяет методы makeNoise, eat.
    public void makeNoise(){
        System.out.println("Horse say \"И-го-го\"!");
    }
    public void eat(){
        System.out.println("Horse eat " + super.getFood());
    }
}
