package pl.javastart.library.app;

import pl.javastart.io.DataReader;
import pl.javastart.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";

        Book[] books = new Book[1000];

        DataReader dataReader = new DataReader();
        books [0] = dataReader.readAndCreateBook();
        books [1] = dataReader.readAndCreateBook();
        dataReader.clos();

        System.out.println(appName);
        System.out.println("Książki sotępne w bibliotece");
        books[0].printInfo ();
        books[1].printInfo ();
    }

}
