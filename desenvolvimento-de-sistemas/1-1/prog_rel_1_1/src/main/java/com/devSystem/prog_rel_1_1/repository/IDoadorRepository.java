package com.devSystem.prog_rel_1_1.repository;

import com.devSystem.prog_rel_1_1.model.Doador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoadorRepository extends JpaRepository<Doador, Long> {
}
