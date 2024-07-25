package com.devSystem.prog_rel_1_1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="doadores")
public class Doador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codDoador;

    @NotBlank(message = "O campo nome é obrigatório!")
    @Size(min=2, message = "O nome deve ter no mínimo 2 caracteres!")
    private String nome;

    @NotBlank(message = "O campo CPF é Obrigatório!!")
    @Size(min=11, message="O cpf deve ser composto apenas de números!!")
    private String CPF;

    @OneToOne(mappedBy = "doador", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Endereco endereco;

    public Doador(){}

    @Override
    public String toString() {
        return String.format("Doador{" +
                "codDoador=" + codDoador +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", endereco=" + endereco +
                '}');
    }

    public Long getCodDoador() {
        return codDoador;
    }

    public void setCodDoador(Long codDoador) {
        this.codDoador = codDoador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
