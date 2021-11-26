package task1;

// а) Создайте класс Phone, который содержит переменные number, model и weight
public class Phone {
    String number;
    String model;
    float weight;

    // д) Добавить конструктор в класс Phone, который принимает на вход три параметра
    Phone(String number, String model, float weight) {
//        this.number = number;
//        this.model = model;
        this(number, model); // з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
        this.weight = weight;
    }

    // е) Добавить конструктор, который принимает на вход два параметра
    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // ж) Добавить конструктор без параметров
    Phone() {
//        this("ghghg", "model", 5);// default data
    }

    // г) Добавить в класс Phone методы:
    // receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
    void receiveCall(String callerName){
        System.out.println(callerName + " calls");
    }

    // и) Добавьте перегруженный метод receiveCall, который принимает два параметра -
    // имя звонящего и номер телефона звонящего.
    void receiveCall(String callerName, String callerNumber){
        System.out.println(callerName  + " calls" + " from number " + callerNumber);
    }
    // getNumber – возвращает номер телефона
    public String getNumber(){
        return this.number;
    }
    // к) Создать метод sendMessage с аргументами переменной длины.
    // Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
    // Метод выводит на консоль номера этих телефонов.
    void sendMessage(String ...numbers){
        System.out.println("Numbers for calling: ");
        for(String currentNumber: numbers){
            System.out.print(currentNumber + " ");
        }
        System.out.println();
    }
}
