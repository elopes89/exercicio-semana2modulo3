package com.lopes.futurodev2.domain.repository;

import com.lopes.futurodev2.domain.model.MarcaModel;
import com.lopes.futurodev2.domain.model.MercadoriaModel;
import com.lopes.futurodev2.rest.dto.ProdutoDto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {

    public void salvarMercadoria(MercadoriaModel mercadoriaModel) {
        var insertTable = "insert into mercadoria (nome, descricao, preco) values ()";
        System.out.println(":Mercadoria inserida com êxito! " + mercadoriaModel.toString());

    }
    public void salvarMarca(MarcaModel marcaModel) {
        //var insertTable = "insert into marca"
        System.out.println(("Marca salva com sucesso!" + marcaModel.toString()));

    }

    public ProdutoDto getProduto(String nome) {
        //var selectMercadoriaComRazao = "select * from Mercadoria inner join endereco ... where nome = :nome";
        ProdutoDto produtoSql = new ProdutoDto();
        produtoSql.setNome("Emanuel Lopes");
        produtoSql.setDescricao("qualidade");
        produtoSql.setPreco(150.0);
        produtoSql.setRazao("Lopes Roupas");
        produtoSql.setNomeFantasia("SK8 And SURF");
        return produtoSql;
    }
}
