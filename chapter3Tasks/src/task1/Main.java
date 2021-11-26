package task1;

public class Main {

    public static void main(String[] args) {
        // б) Создайте три экземпляра этого класса.
        Phone nokia1111 = new Phone();
        Phone nokia = new Phone("+380967534411", "3310", 133f);
        Phone samsung = new Phone("+380967534422", "Samsung Galaxy J3 Pro", 102);
        Phone iphone = new Phone("+380967534433", "iPhone 13 Pro Max", 203f);

        // в) Выведите на консоль значения их переменных.
//        System.out.println("Phone number - " + nokia.number + ", model - " + nokia.model + ", weight - " + nokia.weight);
//        System.out.println("Phone number - " + samsung.number + ", model - " + samsung.model + ", weight - " + samsung.weight);
//        System.out.println("Phone number - " + iphone.number + ", model - " + iphone.model + ", weight - " + iphone.weight);
        System.out.println("nokia1111" + nokia1111.number + ", model - " + nokia1111.model + ", weight - " + nokia1111.weight);

        // г) Вызвать эти методы для каждого из объектов.
        nokia.receiveCall("Ann");
//        System.out.println(nokia.getNumber());

        samsung.receiveCall("Bobby");
//        System.out.println(samsung.getNumber());

        iphone.receiveCall("Peter");
//        System.out.println(iphone.getNumber());
//        System.out.println();

        // и) Вызвать перегруженный метод receiveCall
        nokia.receiveCall("Maria", "+380967534444");
        samsung.receiveCall("Kate", "+380967534455");
        iphone.receiveCall("Ivan", "+380967534466");
//        System.out.println();

        // к) Вызвать метод sendMessage с аргументами переменной длины
        nokia.sendMessage("+380967534477", "+380967534488");
        samsung.sendMessage("+380967534499", "+380967534500", "+380967534511");
        iphone.sendMessage("+380967534522", "+380967534533", "+380967534544", "+380967534555");

    }
}
