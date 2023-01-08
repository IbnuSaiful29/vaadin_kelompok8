package com.example.demo.backend;

import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PenyakitRepository extends JpaRepository<Penyakit, Long>{
    
}
