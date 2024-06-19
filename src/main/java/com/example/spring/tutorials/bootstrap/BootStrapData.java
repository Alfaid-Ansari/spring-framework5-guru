package com.example.spring.tutorials.bootstrap;

import com.example.spring.tutorials.domain.Author;
import com.example.spring.tutorials.domain.Book;
import com.example.spring.tutorials.domain.Publisher;
import com.example.spring.tutorials.repositories.AuthorRepository;
import com.example.spring.tutorials.repositories.BookRepository;
import com.example.spring.tutorials.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("Alfaid","Matiya gate","Mathura","UP","281001");
        publisherRepository.save(publisher);

        System.out.println("Publisher count is: "+publisherRepository.count());

        Author alfaid = new Author("Alfaid","Ansari");
        Book ddd = new Book("Domain Driver Design","123123");
        alfaid.getBooks().add(ddd);
        ddd.getAuthors().add(alfaid);
        bookRepository.save(ddd);
        authorRepository.save(alfaid);

        Author john = new Author("John","Shetty");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        john.getBooks().add(noEJB);
        noEJB.getAuthors().add(john);

        bookRepository.save(noEJB);
        authorRepository.save(john);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: "+bookRepository.count());
    }
}
