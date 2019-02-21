package com.self.homework2.boardChat;


import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Service {

    public void loginUser(User user){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name and email:");
        if (user.getName().equals(sc.nextLine()) && user.getEmail().equals(sc.nextLine())){
            System.out.println("You logged in.");
        }else System.out.println("Your name or email is incorrect.");
    }

}
