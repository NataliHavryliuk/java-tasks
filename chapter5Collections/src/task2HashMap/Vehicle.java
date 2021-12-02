package task2HashMap;

public class Vehicle {
    private String name;
    private Integer number;

    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }

    Vehicle(String name, Integer number){
        this.name = name;
        this.number = number;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result  = 1;
        result = prime * result + name.hashCode();
        result = prime * result + number.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle v = (Vehicle)obj;
        return this.name.equals(v.getName()) && this.number.equals(v.getNumber());
    }

}
