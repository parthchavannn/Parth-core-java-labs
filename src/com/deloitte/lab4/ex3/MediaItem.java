package com.deloitte.lab4.ex3;

public abstract class MediaItem extends Item {
    private int runtime; // in minutes

    // Constructor
    public MediaItem(String id, String title, int numberOfCopies, int runtime) {
        super(id, title, numberOfCopies);
        this.runtime = runtime;
    }

    // Getter and Setter
    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    // Abstract method
    @Override
    public abstract void print();
}
