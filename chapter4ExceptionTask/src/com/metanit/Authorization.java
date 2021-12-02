package com.metanit;

// Создать класс Authorization
public class Authorization {
    private static final String regex = "^\\w{1,20}$";

    // Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
    public static Boolean checkAuthorization(String login, String password, String confirmPassword){
        try {
            if(!login.matches(regex)) {
                System.out.println("Login " + login + " has length " + login.length());
                throw new WrongLoginException("Invalid login entered!");
            }
            if(!password.matches(regex) || !password.equals(confirmPassword)) {
                System.out.println("Password " + password + " has length " + password.length());
                throw new WrongPasswordException("Invalid password entered!");
            }
            return true;
        }
        catch (WrongLoginException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        catch (WrongPasswordException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
