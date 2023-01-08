package com.example.demo.backend;

import java.util.Collection;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PenyakitService implements CrudListener<Penyakit>{
    
    private final PenyakitRepository repository;
    
    @Override
    public Collection<Penyakit> findAll() {
        return repository.findAll();
    }

    @Override
    public Penyakit add(Penyakit penyakit) {
        return repository.save(penyakit);
    }

    @Override
    public Penyakit update(Penyakit penyakit) {
        return repository.save(penyakit);
    }

    @Override
    public void delete(Penyakit penyakit) {
        repository.delete(penyakit);
        
    }
}
