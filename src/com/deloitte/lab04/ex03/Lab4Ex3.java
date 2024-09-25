package com.deloitte.lab04.ex03;

import java.util.Scanner;

public class Lab4Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an item to add to the library:");
            System.out.println("1. Book");
            System.out.println("2. Journal Paper");
            System.out.println("3. Video");
            System.out.println("4. CD");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter Book ID:");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Book Title:");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Enter Number of Copies:");
                    int bookCopies = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Author Name:");
                    String author = scanner.nextLine();
                    Book book = new Book(bookId, bookTitle, bookCopies, author);
                    book.print();
                    break;

                case 2:
                    System.out.println("Enter Journal Paper ID:");
                    int journalId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Journal Title:");
                    String journalTitle = scanner.nextLine();
                    System.out.println("Enter Number of Copies:");
                    int journalCopies = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Author Name:");
                    String journalAuthor = scanner.nextLine();
                    System.out.println("Enter Year Published:");
                    int yearPublished = scanner.nextInt();
                    scanner.nextLine();
                    JournalPaper journal = new JournalPaper(journalId, journalTitle, journalCopies, journalAuthor, yearPublished);
                    journal.print();
                    break;

                case 3:
                    System.out.println("Enter Video ID:");
                    int videoId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Video Title:");
                    String videoTitle = scanner.nextLine();
                    System.out.println("Enter Number of Copies:");
                    int videoCopies = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Runtime (in minutes):");
                    int runtime = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Director Name:");
                    String director = scanner.nextLine();
                    System.out.println("Enter Genre:");
                    String genre = scanner.nextLine();
                    System.out.println("Enter Year Released:");
                    int yearReleased = scanner.nextInt();
                    scanner.nextLine();
                    Video video = new Video(videoId, videoTitle, videoCopies, runtime, director, genre, yearReleased);
                    video.print();
                    break;

                case 4:
                    System.out.println("Enter CD ID:");
                    int cdId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter CD Title:");
                    String cdTitle = scanner.nextLine();
                    System.out.println("Enter Number of Copies:");
                    int cdCopies = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Runtime (in minutes):");
                    int cdRuntime = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Artist Name:");
                    String artist = scanner.nextLine();
                    System.out.println("Enter Genre:");
                    String cdGenre = scanner.nextLine();
                    CD cd = new CD(cdId, cdTitle, cdCopies, cdRuntime, artist, cdGenre);
                    cd.print();
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
