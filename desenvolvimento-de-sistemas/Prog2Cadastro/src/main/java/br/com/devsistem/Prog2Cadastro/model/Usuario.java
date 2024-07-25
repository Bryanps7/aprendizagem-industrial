package br.com.devsistem.Prog2Cadastro.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer idade;

    public Usuario(){}

    public Usuario(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return String.format(" Código %d " +
                " Nome: %s " +
                " Idade: %d %n",
                getId(),getNome(),getIdade());
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
}
