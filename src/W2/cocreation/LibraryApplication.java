package W2.cocreation;

public class LibraryApplication {

    public static void main(String[] args) {
        Library library = new Library();
        Book book = library.getBook("Siddhartha");
        Reader reader = new Reader();
        reader.read(book);
    }
}
