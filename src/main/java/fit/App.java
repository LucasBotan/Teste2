package fit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fit.domain.Book;
import fit.services.BookServiceImpl;
import fit.services.abstracts.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Oi Mundo");

        var bookSvc = appContext.getBean("bookService", BookService.class);
        System.out.println("Dados de livros...");

        bookSvc.add(new Book("Title default", 1));
        System.out.println("Todos os livros da primeira classe...");
        System.out.println(bookSvc.getAll());

        var bookSvc2 = appContext.getBean("bookService", BookService.class);
        System.out.println("Dados de livros...");

        bookSvc2.add(new Book("Title default 2", 2));
        System.out.println("Todos os livros da segunda classe...");
        System.out.println(bookSvc2.getAll());
    }
}
