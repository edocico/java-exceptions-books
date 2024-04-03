package org.experis.library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int booksNumber = 0;
        // chiedo all'utente il numero di libri da inserire nel sistema
        boolean nBookCheck = false;
        while(!nBookCheck) {
            try {
                System.out.println("Quanti libri vuoi inserire nell'elenco?");
                booksNumber = Integer.parseInt(scan.nextLine());
                nBookCheck = true;
            } catch (NumberFormatException e) {
                System.out.println("this must be number");
            }
        }

        Book[] library = new Book[booksNumber];



        for (int i = 0; i < booksNumber; i++) {
            boolean isOK = false;
            do {
                try {
                    System.out.println("inserisci il titolo del libro " + (i+1));
                    String title = scan.nextLine();
                    String titleClean = title.trim();

                    int pageNumber = 0;
                    boolean numberCheck = false;
                    do {
                        try {
                            System.out.println("inserisci il numero di pagine del libro " + (i+1));
                            pageNumber = Integer.parseInt(scan.nextLine());
                            numberCheck = true;
                        } catch (NumberFormatException e) {
                            System.out.println("this must be a number");
                        }
                    } while (!numberCheck);
                    System.out.println("Inserisci l'autore del libro " + (i+1));
                    String author = scan.nextLine();
                    String authorClean = author.trim();
                    System.out.println("inserisci l'editore del libro " + (i+1));
                    String publisher = scan.nextLine();
                    String publisherClean = publisher.trim();
                    library[i] = new Book(titleClean, pageNumber, authorClean, publisherClean);
                    isOK = true;
                } catch (Exception e) {
                    System.out.println("Cannot create this book :" + e.getMessage());
                }
            } while(!isOK);


        }

        // chiudo scanner
        scan.close();

        // creo nuovo file

        File myfile = new File("./");

//        try {
//            for(Book book : library) {
//                FileWriter writer = new FileWriter("librarylist.txt");
//                writer.write(library[i]);
//            }
//        }


    }
}
