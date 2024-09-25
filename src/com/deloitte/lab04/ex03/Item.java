package com.deloitte.lab04.ex03;

abstract class Item {
    private int id;
    private String title;
    private int numberOfCopies;

    public Item(int id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public abstract void print();

    public void checkIn() {
        System.out.println("Item checked in.");
    }

    public void checkOut() {
        System.out.println("Item checked out.");
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Number of Copies: " + numberOfCopies;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return id == item.id;
    }
}
