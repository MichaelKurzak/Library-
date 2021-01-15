//Wczytanie od uzytkownika

package pl.javastart.library.model;

public class Book {

    private String title;
    private String author;
    private int releaseData;
    private int pages;
    private String publisher ;
    private String isbn;

    public Book(String title, String author, int releaseData, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseData = releaseData;
        this.pages = pages;
        this.publisher = publisher;
    }

    public Book(String title, String author, int releaseData, int pages, String publisher, String isbn) {
        this(title, author, releaseData, pages, publisher);
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseData() {
        return releaseData;
    }

    public void setReleaseData(int releaseData) {
        this.releaseData = releaseData;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + releaseData + "; " + pages + "; " + publisher ;
        if(isbn !=null){
            info = info + "; " + isbn;
        }
        System.out.println(info);
    }
}
