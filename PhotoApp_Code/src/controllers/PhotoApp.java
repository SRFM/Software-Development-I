package controllers;

import models.BasicAlbum;
import models.User;

import java.util.Scanner;

public class PhotoApp {

    public static void main(String[] args) {
        User user = new User();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Δημιουργία Άλμπουμ");
            System.out.println("2.Προσθήκη Σελίδας Σε Άλμπουμ");
            System.out.println("3.Επεξεργασία Σελίδας");
            System.out.println("4.Προβολή Λίστας Άλμπουμ");
            System.out.println("5.Προβολή Άλμπουμ ως pptx");
            System.out.println("6.Προβολή Άλμπουμ ως pptx, Χρονολογικά Ταξινομημένο");
            System.out.println("7.Δημιουργία Άλμπουμ απο Αναζήτηση");

            int choice = input.nextInt();
            if (choice <= 0 || choice > 7) {
                continue;
            } else {
                if (choice == 1) {
                    user.createAlbume();
                } else if (choice == 2) {
                    user.selectAlbum();
                } else if (choice == 3) {

                } else if (choice == 4) {
                    user.viewAlbumList();
                } else if (choice == 5) {
                    user.viewAsPPTX();
                } else if (choice == 6) {
                    user.viewAsPPTXSorted();
                } else if (choice == 7) {
                    user.searchKeyword();
                }
            }
        }
    }
}
