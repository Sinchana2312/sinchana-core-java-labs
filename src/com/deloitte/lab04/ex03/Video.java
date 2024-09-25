package com.deloitte.lab04.ex03;

class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int id, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased;
    }

    @Override
    public void print() {
        System.out.println("Video Details: " + toString());
    }
}
