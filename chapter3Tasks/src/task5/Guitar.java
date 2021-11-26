package task5;

class Guitar implements Instrument{

    private int stringsCount;

    public int getStringsCount(){
        return stringsCount;
    }

    Guitar(int stringsCount){
        this.stringsCount = stringsCount;
    }

    public String play(){
        return "Guitar is playing " + KEY + " with "+ getStringsCount() + " strings";
    }
}
