package com.deloitte.lab04.ex03;

class Book extends WrittenItem {
    public Book(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book Details: " + toString());
    }
}
