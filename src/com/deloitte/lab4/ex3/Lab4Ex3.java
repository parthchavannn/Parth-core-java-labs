package com.deloitte.lab4.ex3;

public class Lab4Ex3 {
    public static void main(String[] args) {
        Book book = new Book("B001", "Java Programming", 5, "John Doe");
        JournalPaper journal = new JournalPaper("J001", "Advanced Algorithms", 3, "Jane Smith", 2022);
        Video video = new Video("V001", "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd = new CD("C001", "Abbey Road", 10, 47, "The Beatles", "Rock");

        // Print details of each item
        book.print();
        journal.print();
        video.print();
        cd.print();
    }
}
