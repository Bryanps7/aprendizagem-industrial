package com.devSystem.prog_rel_1_1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="enderecos")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codEndereco;

    @NotBlank(message = "O campo rua é obrigatório!!")
    @Size(min=2, message ="O nome da rua deve ter pelo menos 2 caracteres")
    private String rua;

    @NotNull
    @Size(min=1, message = "O número da rua deve ter pelo menos 1 dígito!")
    private Integer numero;

    @OneToOne
    @JoinColumn(name = "doador", referencedColumnName = "codDoador", nullable = false)
    @JsonIgnore
    private Doador doador;

    public Endereco() {}



    public Long getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(Long codEndereco) {
        this.codEndereco = codEndereco;
    }

    @Override
    public String toString() {
        return String.format("Endereco{" +
                "codEndereco=" + codEndereco +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", doador=" + doador +
                '}');
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }
}
