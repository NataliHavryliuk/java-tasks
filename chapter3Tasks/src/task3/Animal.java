package task3;

// Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
// Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
public abstract class Animal {
    private String food, location;

    public String getFood(){
        return food;
    }
    public String getLocation(){
        return location;
    }

    Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep(){
        System.out.println(this.getClass().getSimpleName() + " is sleeping");

    }
}
