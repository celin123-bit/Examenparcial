package com.example.examenparcial.repository;

import com.example.examenparcial.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingIgnoreCase(String name); // Método para buscar productos por nombre
}
