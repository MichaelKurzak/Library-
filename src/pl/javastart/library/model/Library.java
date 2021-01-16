package pl.javastart.library.model;

public class Library {

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINE = 1000;
    private Book[] books = new Book[MAX_BOOKS];
    private Magazine[] magazines = new Magazine[MAX_MAGAZINE];
    private int booksNumber;
    private int magazinesNumber;


    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
            books[booksNumber] = book;
            booksNumber++;
        } else{
            System.out.println("Makymalna liczba książek zostałą osiągnięta");
        }
    }

    public void printBooks(){
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }

    public void addMagazine(Magazine magazine) {
        if (magazinesNumber < MAX_MAGAZINE) {
            magazines[magazinesNumber] = magazine;
            magazinesNumber++;
        } else{
            System.out.println("Makymalna liczba magazynów zostałą osiągnięta");
        }

    }

    public void printMagazine(){
        if (magazinesNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }
        for (int i = 0; i < magazinesNumber; i++) {
            magazines[i].printInfo();
        }
    }
}
