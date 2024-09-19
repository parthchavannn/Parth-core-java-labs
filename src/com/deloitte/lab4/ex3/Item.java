package com.deloitte.lab4.ex3;

public abstract class Item {
    private String id;
    private String title;
    private int numberOfCopies;

    // Constructor
    public Item(String id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    // Abstract methods
    public abstract void print();

    // Common methods
    public boolean checkIn() {
        if (numberOfCopies < 0) {
            return false;
        }
        numberOfCopies++;
        return true;
    }

    public boolean checkOut() {
        if (numberOfCopies <= 0) {
            return false;
        }
        numberOfCopies--;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return id.equals(item.id);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
