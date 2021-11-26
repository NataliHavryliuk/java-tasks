package task5;

class Drum implements Instrument{

    private double size;

    public double getSize(){
        return size;
    }

    Drum(double size){
        this.size = size;
    }

    public String play(){
        return "Drum is playing " + KEY + " with size " + getSize() + " inches";
    }

}
