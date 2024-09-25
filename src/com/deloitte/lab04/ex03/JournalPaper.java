package com.deloitte.lab04.ex03;

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }

    @Override
    public void print() {
        System.out.println("Journal Paper Details: " + toString());
    }
}
