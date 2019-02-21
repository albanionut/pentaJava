package com.self.homework2.boardChat;

public class Message {
    private User user;
    private String author;
    private String description;

    public Message(User user, String author, String description) {
        this.user = user;
        this.author = author;
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "User " + user.getName() +" send: "+
                " Author:'" + author + '\'' +
                ", Description='" + description + '\'';
    }
}
