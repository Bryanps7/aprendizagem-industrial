package br.com.devsistem.Prog1Cadastro.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer idade;

    public usuario(){ }

    public usuario(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format(
                "| Nome: %s" +
                "  | Código: %d" +
                "  | Idade: %d",
                getNome(),getId(),getIdade();

    }
}
