package org.iesfm.library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Book book = readBook();
        book.info();
    }

    static Book readBook() {
        Book book = null;
        while(book == null) {
            try {
                int isbn = scan.nextInt();
                scan.nextLine();
                String title  ="Libro de prueba";
                String author  ="Menganito";
                String[] genres = new String[1];
                genres[0] = "Terror";
                book = new Book(isbn, title, author, genres);
            } catch(InputMismatchException e) {
                scan.nextLine();
                System.out.println("Error leyendo el ISBN, debe ser un número...");
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Error creando géneros..." + e.getMessage());
                e.printStackTrace();
            }
        }
        return book;
    }
}
