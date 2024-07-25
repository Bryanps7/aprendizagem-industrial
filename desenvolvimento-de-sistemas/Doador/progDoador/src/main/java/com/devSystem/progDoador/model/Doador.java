package com.devSystem.progDoador.model;

import jakarta.persistence.*;

@Entity
@Table(name="doadores")
public class Doador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private Integer cpf;
    private String telefone;
    private String email;
    private String cep;
    private String logradouro;
    private String numero; // usando String em função do número pode ter letras ex: 35A
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf; // sigla para estado

    public Doador() {}

    @Override
    public String toString() {
        return String.format("| Doador: %s \n" +
                             "  | Código: %d \n" +
                             "  | CPF: %d \n" +
                             "  | Telefone: %s \n" +
                             "  | Email: %s \n" +
                             "  | CEP: %s \n" +
                             "  | Logradouro: %s \n" +
                             "  | Número: %s \n" +
                             "  | Complemento: %s \n" +
                             "  | Bairro: %s \n" +
                             "  | Localidade: %s \n" +
                             "  | UF: %s \n",
                             getNome(),getCodigo(),getCpf(),getTelefone(),getEmail(),getCep(),getLogradouro(),getNumero(),getComplemento(),getBairro(),getLocalidade(),getUf());
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
