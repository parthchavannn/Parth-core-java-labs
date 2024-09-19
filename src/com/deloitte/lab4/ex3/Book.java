package com.deloitte.lab4.ex3;

public class Book extends WrittenItem {

    // Constructor
    public Book(String id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book [ID=" + getId() + ", Title=" + getTitle() + ", Author=" + getAuthor() +
                ", Copies=" + getNumberOfCopies() + "]");
    }
}
