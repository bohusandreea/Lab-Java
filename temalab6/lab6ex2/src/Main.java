// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
* Creati o clasa Book cu attributele title, author, ISBN.
* Creati o clasa Library care are ca atribut o lista de Books
* si metode de adaugare si stergere carti din lista.
* In clasa main creati cateva instante de books, dupa care le adaugati si stergeti din library.*/
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        Book book3 = new Book("1984", "George Orwell", "978-0-452-28423-4");


        Library library = new Library();


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.PrintBooks();


        library.deleteBook(book2);

        System.out.println("\n Dupa stergere lista este : ");
        library.PrintBooks();


    }
}