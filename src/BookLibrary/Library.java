package BookLibrary;


public class Library {

    public Book getBook(String name) {
        return new Book(name);
    }

}