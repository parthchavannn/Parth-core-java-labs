package com.deloitte.lab4.ex3;

public class JournalPaper extends WrittenItem {
    private int yearPublished;

    // Constructor
    public JournalPaper(String id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    // Getter and Setter
    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public void print() {
        System.out.println("JournalPaper [ID=" + getId() + ", Title=" + getTitle() + ", Author=" + getAuthor() +
                ", Year Published=" + yearPublished + ", Copies=" + getNumberOfCopies() + "]");
    }
}
