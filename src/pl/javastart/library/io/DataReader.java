package pl.javastart.library.io;

import pl.javastart.library.model.Book;

import java.util.Scanner;

public class DataReader {

    private Scanner sc = new Scanner(System.in);

    public Book readAndCreateBook() {
        System.out.println("Proszę o podanie tytułu");
        String title = sc.nextLine();
        System.out.println("Proszę o podanie autora");
        String author = sc.nextLine();
        System.out.println("Proszę o podanie wydawcy");
        String publisher = sc.nextLine();
        System.out.println("Proszę o podanie ISBN");
        String isbn = sc.nextLine();
        System.out.println("Proszę o podanie daty wydania");
        int releaseData = sc.nextInt();
        System.out.println("Proszę o podanie ilości stron");
        int pages = sc.nextInt();
        sc.nextLine();
        return new Book (title, author, releaseData, pages, publisher, isbn);
    }

    public int getInt() {                                                    //odczyt opcji wybranej przez urzytkownika
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public void clos() {
        sc.close();
    }

}
