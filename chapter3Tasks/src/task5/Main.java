package task5;

public class Main {

    public static void main(String[] args) {
        // Создать массив типа Инструмент, содержащий инструменты разного типа.
        Instrument[] instruments = {
          new Guitar(6),
          new Guitar(7),
          new Drum(5.5),
          new Drum(12),
          new Trumpet(11.63),
          new Trumpet(0.458)
        };

        // В цикле вызвать метод play() для каждого инструмента, который должен выводить
        // строку "Играет такой-то инструмент, с такими-то характеристиками".
        for (Instrument instrument : instruments){
            System.out.println( instrument.play() );
        }

    }

}
