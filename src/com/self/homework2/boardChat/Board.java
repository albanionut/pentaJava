package com.self.homework2.boardChat;

import java.util.ArrayList;

public class Board {
    ArrayList<Message> messages =new ArrayList<>();

    public void addMessage(Message message){
        messages.add(message);
    }

    public void printBoard(){
        for (Message message : messages){
            System.out.println(message.toString());
        }
    }



}
