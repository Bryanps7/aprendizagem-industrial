package com.devSystem.SistEstoque.dto;

import java.time.LocalDate;

public class EntregaProdutoDTO {
    private Long codEntrega;
    private LocalDate dataEntrega;
    private String responsavelEntrega;
    private Long funcionarioId;
    private Long estoqueId;

    public EntregaProdutoDTO(){}

    public EntregaProdutoDTO(Long codEntrega, LocalDate dataEntrega,
                    String responsavelEntrega, Long funcionarioId,
                             Long estoqueId) {
        this.codEntrega = codEntrega;
        this.dataEntrega = dataEntrega;
        this.responsavelEntrega = responsavelEntrega;
        this.funcionarioId = funcionarioId;
        this.estoqueId = estoqueId;
    }

    public Long getCodEntrega() {
        return codEntrega;
    }

    public void setCodEntrega(Long codEntrega) {
        this.codEntrega = codEntrega;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getResponsavelEntrega() {
        return responsavelEntrega;
    }

    public void setResponsavelEntrega(String responsavelEntrega) {
        this.responsavelEntrega = responsavelEntrega;
    }

    public Long getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public Long getEstoqueId() {
        return estoqueId;
    }

    public void setEstoqueId(Long estoqueId) {
        this.estoqueId = estoqueId;
    }

    @Override
    public String toString() {
        return "EntregaProdutoDTO{" +
                "codEntrega=" + codEntrega +
                ", dataEntrega=" + dataEntrega +
                ", responsavelEntrega='" + responsavelEntrega + '\'' +
                ", funcionarioId=" + funcionarioId +
                ", estoqueId=" + estoqueId +
                '}';
    }

}
