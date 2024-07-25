package com.example.devtwo.progProduto.model;

public class Produto {
    private Long id;
    private String nome;
    private String marca;
    private Integer quantidade;
    private Double preco;

    public Produto () {}

    public Produto(Long id, String nome, String marca, Integer quantidade, Double preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}');
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }
}
