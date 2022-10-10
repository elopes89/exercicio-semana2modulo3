package com.lopes.futurodev2.rest.controller;

import com.lopes.futurodev2.domain.service.ProdutoService;
import com.lopes.futurodev2.rest.dto.ProdutoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping("/salvaProduto")
    public String salvarProduto(@RequestBody ProdutoDto produtoDto) {
        produtoService.salvar(produtoDto);
        return "PRODUTO SALVO";
    }

    @GetMapping("buscaProduto")
    public ProdutoDto buscarProduto() {
        ProdutoDto produtoDtoPeloNome = produtoService.buscarProduto("nome");
        return produtoDtoPeloNome;
    }
    @GetMapping("statusProduto")
    public String status() {
        String state = produtoService.statusProduto("volcom");
        return state;
    }
}
