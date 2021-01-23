package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.Magazine;

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
        System.out.println("Proszę o podanie roku wydania");
        int releaseData = getInt();
        System.out.println("Proszę o podanie ilości stron");
        int pages = getInt();
        return new Book (title, author, publisher, pages,releaseData, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Proszę o podanie tytułu");
        String title = sc.nextLine();
        System.out.println("Proszę o podanie wydawnictwa");
        String publisher = sc.nextLine();
        System.out.println("Proszę o podanie jezyka");
        String language = sc.nextLine();
        System.out.println("Proszę o podanie roku wydania");
        int year = getInt();
        System.out.println("Proszę o podanie miesiąca wydania");
        int month = getInt();
        System.out.println("Proszę o podanie dnia wydania");
        int day = getInt();
        return new Magazine(title, publisher, language, year, month, day);
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
