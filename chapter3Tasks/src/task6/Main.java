package task6;

public class Main {

    public static void main(String[] args) {
        Season SUMMER = Season.SUMMER;
        Season favorite = Season.SPRING;

        Season[] seasons = Season.values();
        for (Season s : seasons) {
            sayLove(s);
            s.getAverageTemperature();
            System.out.println( s.getDescription(s) );
            System.out.println();
        }

        sayLove(favorite);
        favorite.getAverageTemperature();
        System.out.println(favorite.getDescription(favorite));
        System.out.println();

        sayLove(SUMMER);
        System.out.println(SUMMER.getDescription()); // not correct
        System.out.println(SUMMER.getDescription(SUMMER));
    }

    public static void sayLove(Season season){
        switch(season){
            case WINTER:
                System.out.println("I love WINTER");
                break;
            case SPRING:
                System.out.println("I love SPRING");
                break;
            case SUMMER:
                System.out.println("I love SUMMER");
                break;
            case AUTUMN:
                System.out.println("I love AUTUMN");
                break;
        }
    }

}

// Создать перечисление, содержащее названия времен года.
enum Season{
    WINTER("-3,8°С"),
    SPRING("+6,6°С"),
    SUMMER("+20,0°С"),
    AUTUMN("+9,7°С");

    // Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
    private String averageTemperature;

    // Добавить конструктор принимающий на вход среднюю температуру.
    Season (String averageTemperature){
        this.averageTemperature = averageTemperature;
    }

    public void getAverageTemperature(){
        System.out.println("Average temperature is " + averageTemperature);
    }

    // Создать метод getDescription, возвращающий строку “Холодное время года”.
    public String getDescription(){
        return "It is cold season";
    }
    // Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
    public String getDescription(Season season){
        return season == SUMMER ?  "It is warm season" : getDescription();
    }
}

