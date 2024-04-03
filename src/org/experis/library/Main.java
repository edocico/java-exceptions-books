package org.experis.library;

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
            System.out.println("inserisci il titolo");
            String title = scan.nextLine();

        }

        // chiudo scanner
        scan.close();
    }
}
