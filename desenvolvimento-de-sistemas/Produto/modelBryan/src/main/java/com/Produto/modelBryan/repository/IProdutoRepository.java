package com.Produto.modelBryan.repository;

import com.Produto.modelBryan.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
}
