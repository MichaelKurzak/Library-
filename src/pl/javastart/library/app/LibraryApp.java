package pl.javastart.library.app;

class LibraryApp {
    private static final String APP_NAME = "Biiblioteka v1.1";
    public static void  main(String[] args){
        final String appName = "Biblioteka v 1.2";
        System.out.println(APP_NAME);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();

    }



}
