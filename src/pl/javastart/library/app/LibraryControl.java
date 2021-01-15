package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;

public class LibraryControl {

    private final int exit = 0;
    private final int addBook = 1;
    private final int printsBooks = 2;
    private DataReader dataReader = new DataReader();
    private Library library= new Library();

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printsBooks:
                    printsBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Błędna opcja");
            }
        } while ((option != exit));
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
        System.out.println(exit + " 0 - Wyjście z programu");
        System.out.println(addBook + " 1 - Dodanie nowej książki");
        System.out.println(printsBooks + " 2 - Wyświetl dostępne książki");
    }
}
