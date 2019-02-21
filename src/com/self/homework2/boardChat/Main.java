package com.self.homework2.boardChat;

public class Main {
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
