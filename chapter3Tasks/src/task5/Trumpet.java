package task5;

class Trumpet implements Instrument{

    private double diameter;

    public double getDiameter(){
        return diameter;
    }

    Trumpet(double diameter){
        this.diameter = diameter;
    }

    public String play(){
        return "Trumpet is playing " + KEY + " with diameter " + getDiameter() + " millimeters";
    }

}
