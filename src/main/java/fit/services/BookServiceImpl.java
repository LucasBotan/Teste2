package fit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fit.domain.Book;
import fit.repository.abstracts.BookRepository;
import fit.services.abstracts.BookService;

public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository repo;

    public BookServiceImpl() {
        super();
        System.out.println("criando BookServiceImpl");
    }

    public List<Book> add(Book book) {
        repo.add(book);

        return repo.getAll();
    }

    public List<Book> getAll() {
        return repo.getAll();
    }


}
