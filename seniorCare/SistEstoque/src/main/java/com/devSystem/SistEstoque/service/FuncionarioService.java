package com.devSystem.SistEstoque.service;

import com.devSystem.SistEstoque.dto.FuncionarioDTO;
import com.devSystem.SistEstoque.model.Funcionario;
import com.devSystem.SistEstoque.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    private FuncionarioRepository repositorioFuncionario;

    @Autowired
    public FuncionarioService(FuncionarioRepository repositorioFuncionario){
        this.repositorioFuncionario = repositorioFuncionario;
    }

    public FuncionarioDTO cadastrar(FuncionarioDTO funcionarioDTO){
        Funcionario funcionario = converterParaEntity(funcionarioDTO);
        Funcionario salvaFuncionario = repositorioFuncionario.save(funcionario);
        return converterParaDTO(salvaFuncionario);
    }


    private Funcionario converterParaEntity(FuncionarioDTO funcionarioDTO){
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeFuncionario(funcionarioDTO.getNomeFuncionario());
        funcionario.setCargoFuncionario(funcionarioDTO.getCargoFuncionario());
        funcionario.setCpfFuncionario(funcionarioDTO.getCpfFuncionario());
        funcionario.setTelefoneFuncionario(funcionarioDTO.getTelefoneFuncionario());
        funcionario.setSituacaoFuncionario(funcionarioDTO.getSituacaoFuncionario());
        return funcionario;
    }

    private FuncionarioDTO converterParaDTO(Funcionario funcionario){
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        funcionarioDTO.setCodFuncionario(funcionario.getCodFuncionario());
        funcionarioDTO.setNomeFuncionario(funcionario.getNomeFuncionario());
        funcionarioDTO.setCargoFuncionario(funcionario.getCargoFuncionario());
        funcionarioDTO.setCpfFuncionario(funcionario.getCpfFuncionario());
        funcionarioDTO.setTelefoneFuncionario(funcionario.getTelefoneFuncionario());
        funcionarioDTO.setSituacaoFuncionario(funcionario.getSituacaoFuncionario());
        return funcionarioDTO;
    }
}
