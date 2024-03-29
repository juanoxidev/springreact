package com.springreact.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreact.test.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
