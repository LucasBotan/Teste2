package fit.repository;

import java.util.ArrayList;
import java.util.List;

import fit.domain.Book;
import fit.repository.abstracts.BookRepository;

public class BookRepositoryImpl implements BookRepository {
    private List<Book> books;

    public BookRepositoryImpl() {
        super();
        System.out.println("Construindo BookRepositoryImpl");
        books = new ArrayList<Book>();
        books.add(new Book("default", 0));
    }

    public List<Book> getAll() {
        return books;
    }

    public List<Book> add(Book book) {
        books.add(book);

        return books;
    }
}
