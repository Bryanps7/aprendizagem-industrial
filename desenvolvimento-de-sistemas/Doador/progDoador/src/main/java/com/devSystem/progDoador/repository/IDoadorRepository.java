package com.devSystem.progDoador.repository;

import com.devSystem.progDoador.model.Doador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoadorRepository extends JpaRepository<Doador, Long> {
}
