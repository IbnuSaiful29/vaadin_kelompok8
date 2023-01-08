package com.example.demo.backend;

import java.util.Collection;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService implements CrudListener<Book>{

    private final BookRepository repository;
    @Override
    public Collection<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book add(Book book) {
        return repository.save(book);
    }

    @Override
    public Book update(Book book) {
        return repository.save(book);
    }

    @Override
    public void delete(Book book) {
        repository.delete(book);
        
    }


    
}
