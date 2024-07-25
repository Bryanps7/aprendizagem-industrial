package com.devSystem.SistEstoque.repository;

import com.devSystem.SistEstoque.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
