package fit.services.abstracts;

import java.util.List;

import fit.domain.Book;

public interface BookService {
    public List<Book> add(Book book);
    public List<Book> getAll();
}
