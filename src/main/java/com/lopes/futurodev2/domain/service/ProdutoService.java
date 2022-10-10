package com.lopes.futurodev2.domain.service;

import com.lopes.futurodev2.domain.model.MarcaModel;
import com.lopes.futurodev2.domain.model.MercadoriaModel;
import com.lopes.futurodev2.domain.repository.ProdutoRepository;
import com.lopes.futurodev2.rest.dto.ProdutoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public void salvar(ProdutoDto produtoDto) {
        MercadoriaModel mercadoriaModel = new MercadoriaModel();
        mercadoriaModel.setNome(produtoDto.getNome());
        mercadoriaModel.setDescricao(produtoDto.getDescricao());
        mercadoriaModel.setPreco(produtoDto.getPreco());
        produtoRepository.salvarMercadoria(mercadoriaModel);

        MarcaModel marcaModel = new MarcaModel();
        marcaModel.setNomeFantasia(produtoDto.getNomeFantasia());
        marcaModel.setRazao(produtoDto.getRazao());
        produtoRepository.salvarMarca(marcaModel);
        System.out.println("Produto salvo com sucesso!");
    }

    public ProdutoDto buscarProduto(String nome) {
        return produtoRepository.getProduto(nome);
    }


    public String statusProduto(String nome) {
        if(nome.equals("mcd")) {
            return "Em estoque";
        } else
            return "Em falta";
    }
}