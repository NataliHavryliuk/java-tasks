package com.metanit;

public class Main {

    public static void main(String[] args) {
        if(Authorization.checkAuthorization("New_user157", "NewSecur%1tyPass", "NNewSecur1tyPass"))
            System.out.println("1) Authorization successful!");

        if(Authorization.checkAuthorization("NewUser;'sdsdsdsd2sd5dsdsd.", "New%Secur1tyP*ass2", "NewSecur1tyPass2"))
            System.out.println("2) Authorization successful!");

        if(Authorization.checkAuthorization("NewUser1", "NewSecur1tyPass", "NewSecur1tyPass"))
            System.out.println("3) Authorization successful!");

        if(Authorization.checkAuthorization("NewUser_2", "NewSecur1tyPass", "NewSecur1tyPass2"))
            System.out.println("4) Authorization successful!");
    }
}