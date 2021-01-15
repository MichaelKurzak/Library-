package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;

public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int PRINTS_BOOKS = 2;
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
                case PRINTS_BOOKS:
                    printsBooks();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Błędna opcja");
            }
        } while ((option != EXIT));
    }

    private void exit() {
        System.out.println("Koniec programu, papa");
        dataReader.clos();
    }

    private void printsBooks() {

        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję");
        System.out.println(EXIT + " - Wyjście z programu");
        System.out.println(ADD_BOOK + " - Dodanie nowej książki");
        System.out.println(PRINTS_BOOKS + " - Wyświetl dostępne książki");
    }
}
