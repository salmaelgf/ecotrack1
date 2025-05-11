package org.example.ecotrack1.repository;



import org.example.ecotrack1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByBarcode(String barcode);
}