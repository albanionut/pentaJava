package com.self.homework2.boardChat;

public class Main {
    /*
    Create a console application from the following requirements:
    We have some users that can register into an app with name & email
    Users are able to post messages on a board
    Each message has a description and an author
    The board can display messages from all the users
     */
    public static void main(String[] args) {
        Service service = new Service();
        User user1 = new User("Alban","alban@yahoo.com");
        Message message = new Message(user1,"babes","Sa traiasca lumea");
        Message message1=new Message(user1,"boliath","noi sa fim sanatosi");
        Board board = new Board();
        board.addMessage(message);
        board.addMessage(message1);
        board.printBoard();
        service.loginUser(user1);




    }
}
