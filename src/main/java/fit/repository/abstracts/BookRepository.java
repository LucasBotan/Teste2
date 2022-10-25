package fit.repository.abstracts;

import java.util.List;

import fit.domain.Book;

public interface BookRepository {
    public List<Book> getAll();
    public List<Book> add(Book book);
}
