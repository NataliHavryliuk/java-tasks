package com.metanit;

public class WrongLoginException extends Exception{
    // пользовательские классы исключения с двумя конструкторами – один по умолчанию
    WrongLoginException(){
//        this("Empty WrongLoginException");
        super("WrongLoginException");
    }

    // второй принимает сообщение исключения и передает его в конструктор класса Exception.
    WrongLoginException(String message) {
        super(message);
    }
}
