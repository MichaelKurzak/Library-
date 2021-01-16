package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;
import pl.javastart.library.model.Magazine;

public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int ADD_MAGAZINE = 2;
    private static final int PRINTS_BOOKS = 3;
    private static final int PRINTS_MAGAZINES = 4;
    private DataReader dataReader = new DataReader();
    private Library library= new Library();

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINTS_BOOKS:
                    printsBooks();
                    break;
                case PRINTS_MAGAZINES:
                    printsMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Błędna opcja");
            }
        } while ((option != EXIT));
    }

    private void printsMagazines() {
        library.printMagazine();
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printsBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void exit() {
        System.out.println("Koniec programu, papa");
        dataReader.clos();
    }


    private void printOptions() {
        System.out.println("Wybierz opcję");
        System.out.println(EXIT + " - Wyjście z programu");
        System.out.println(ADD_BOOK + " - Dodanie nowej książki");
        System.out.println(ADD_MAGAZINE + " - Dodanie nowej magazyn");
        System.out.println(PRINTS_BOOKS + " - Wyświetl dostępne książki");
        System.out.println(PRINTS_MAGAZINES + " - Wyświetl dostępne magazyny");
    }
}
