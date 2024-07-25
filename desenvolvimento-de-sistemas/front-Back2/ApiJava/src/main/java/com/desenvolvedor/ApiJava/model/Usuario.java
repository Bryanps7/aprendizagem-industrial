package com.desenvolvedor.ApiJava.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private Double altura;
    private Double peso;
    private Double imc;

    public Usuario () {

    }

    @Override
    public String toString(){
        return String.format("| Código: %d \n" +
                             "  | Nome: %s \n" +
                             "  | Sobrenome: %s \n" +
                             "  | Idade: %d \n" +
                             "  | Altura: %.2f \n" +
                             "  | Peso: %.2f \n" +
                             "  | IMC: %.2f",
                             getId(), getNome(), getSobrenome(), getIdade(), getAltura(), getPeso(), IMC());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public Double IMC(){
        double imcTop;
        imcTop = this.peso * this.altura;
        return imcTop;
    }
}
