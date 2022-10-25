package fit.services;

import java.util.List;

import fit.domain.Book;
import fit.repository.BookRepository;

public class BookService {
    private BookRepository repo;

    public BookService() {
        super();
        repo = new BookRepository();
    }

    public List<Book> add(Book book) {
        repo.add(book);

        return repo.getAll();
    }

    public List<Book> getAll() {
        return repo.getAll();
    }


}
