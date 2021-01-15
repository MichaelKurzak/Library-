package pl.javastart.library.app;

class LibraryApp {
    private static final  String APP_NAME = "Biiblioteka v1.0";
    public static void  main(String[] args){
        final String appName = "Biblioteka v 0.9";
        System.out.println(appName);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();

    }



}
