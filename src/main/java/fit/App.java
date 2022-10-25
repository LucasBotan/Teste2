package fit;

import fit.domain.Book;
import fit.services.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var bookSvc = new BookService();
        System.out.println("Dados de livros...");

        bookSvc.add(new Book("Title default", 1));
        System.out.println(bookSvc.getAll());
    }
}
