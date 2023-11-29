import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    public Library()
    {
        this.books=new ArrayList<>();
    }

    public void addBook(Book book)
    {

        if (books.stream().anyMatch(existingBook -> existingBook.equals(book))) {
        System.out.println("Exista deja cartea!");
    } else {
        books.add(book);}

        //books.add(book);
    }

    public void deleteBook(Book book)
    {
        if (books.stream().anyMatch(existingBook -> existingBook.equals(book))) {
            books.remove(book);
        } else {
            System.out.println("Cartea nu exista!");}

        //books.remove(book);
    }

    public void PrintBooks()
    {
        books.stream().forEach(book -> System.out.println(book.getTitle()+ " "+ book.getAuthor()+ " "+ book.getISBN()));
    }
}
