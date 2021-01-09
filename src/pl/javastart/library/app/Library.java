package pl.javastart.library.app;

import pl.javastart.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.7";


        Book[] books = new Book[1000];
        books[0] = new Book("W pustyni i w puszczy","Henryk Siękiewicz",
                2010, 296, "W pustyni i w puszczy", "8446544684846846");
        books[1] = new Book("Java. Efektywne programowamie. Wydanie II","Joshua Bolch",
                2009, 352, "Helion", "9788324620845");
        books[2] = new Book("SCJP Sun Certyfified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra",2008,
                851, "McGraw-Hill Osborne Media");



        System.out.println(appName);
        System.out.println("Książki sotępne w bibliotece");
        books[0].printInfo ();
        books[1].printInfo ();
        books[2].printInfo ();


    }
}
