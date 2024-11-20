package com.cupon.cuponsmanagement.repository;

import com.cupon.cuponsmanagement.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
