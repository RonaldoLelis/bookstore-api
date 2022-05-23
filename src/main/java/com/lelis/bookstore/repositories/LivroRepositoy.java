package com.lelis.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lelis.bookstore.domain.Livro;

@Repository
public interface LivroRepositoy extends JpaRepository<Livro, Integer> {

}