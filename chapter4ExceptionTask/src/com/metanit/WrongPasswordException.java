package com.metanit;

public class WrongPasswordException extends Exception{
    // пользовательские классы исключения с двумя конструкторами – один по умолчанию
    WrongPasswordException(){
//        this("Empty WrongPasswordException");
        super("WrongPasswordException");
    }

    // второй принимает сообщение исключения и передает его в конструктор класса Exception.
    WrongPasswordException(String message) {
        super(message);
    }
}
