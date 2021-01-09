package pl.javastart.library.app;

import pl.javastart.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book book1 = new Book("W pustyni i w puszczy","Henryk Siękiewicz",
                2010, 296, "W pustyni i w puszczy", "8446544684846846");
        Book book2 = new Book("Java. Efektywne programowamie. Wydanie II","Joshua Bolch",
                2009, 352, "Helion", "9788324620845");
        Book book3 = new Book("SCJP Sun Certyfified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra",2008,
                851, "McGraw-Hill Osborne Media");



        System.out.println(appName);
        System.out.println("Książki sotępne w bibliotece");
        book1.printInfo ();
        book2.printInfo ();
        book3.printInfo ();


    }
}
