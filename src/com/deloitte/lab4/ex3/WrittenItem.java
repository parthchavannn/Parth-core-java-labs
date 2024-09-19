package com.deloitte.lab4.ex3;

public abstract class WrittenItem extends Item {
    private String author;

    // Constructor
    public WrittenItem(String id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies);
        this.author = author;
    }

    // Getter and Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method
    @Override
    public abstract void print();
}
