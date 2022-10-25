package fit;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import fit.repository.BookRepositoryImpl;
import fit.services.BookServiceImpl;

@Configuration
public class AppConfig {
    @Bean(name = "bookService")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public BookServiceImpl buildBookService() {
        return new BookServiceImpl();
    }

    @Bean(name = "bookRepository")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public BookRepositoryImpl buildBookRepository() {
        return new BookRepositoryImpl();
    }
}
