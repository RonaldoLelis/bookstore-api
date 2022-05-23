package com.lelis.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lelis.bookstore.domain.Categoria;

@Repository
public interface CategoriaRepositoy extends JpaRepository<Categoria, Integer> {

}
