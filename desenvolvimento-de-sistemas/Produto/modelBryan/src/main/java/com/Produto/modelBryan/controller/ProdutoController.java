package com.Produto.modelBryan.controller;

import com.Produto.modelBryan.model.Produto;
import com.Produto.modelBryan.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    private final IProdutoRepository repositorioProduto;

    public ProdutoController(IProdutoRepository repositorioProduto) {
        this.repositorioProduto = repositorioProduto;
    }


    @PostMapping
    public String postProduto(@RequestBody Produto prod) {
        try {
            System.out.println("Valores = "+prod);
            Produto novoProduto = repositorioProduto.save(prod);

            return "Feito";
        }catch(Exception e) {
            e.printStackTrace();
            return "resre"; // ajustar
        }
    }
}
