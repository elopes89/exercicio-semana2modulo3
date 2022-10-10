package com.lopes.futurodev2.domain.repository;

import com.lopes.futurodev2.domain.model.ClienteModel;
import com.lopes.futurodev2.domain.model.EnderecoModel;
import com.lopes.futurodev2.rest.dto.UsuarioDto;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {

    public void salvarCliente(ClienteModel clienteModel) {
        var insertTable = "insert into cliente (nome, cpf) values ()";
        System.out.println("Cliente inserido com sucesso!" + clienteModel.toString());
    }

    public String salvarEndereco(EnderecoModel enderecoModel) {
        var insertTable = "insert into endereco () values ()";
        return "Endereço inserido com sucesso!";
    }

    public UsuarioDto getUsuario(String cpf) {
        var selectClienteComEndereco = "select * from cliente inner join endereco ... where cpf = :cpf";
        UsuarioDto usuarioDtoRetornadoDoSql = new UsuarioDto();
        usuarioDtoRetornadoDoSql.setNome("Emanuel Lopes");
        usuarioDtoRetornadoDoSql.setCpf("456546464646");
        usuarioDtoRetornadoDoSql.setCep("123456789");
        usuarioDtoRetornadoDoSql.setCidade("São Miguel do Oeste");
        usuarioDtoRetornadoDoSql.setEstado("Santa Catarina");
        usuarioDtoRetornadoDoSql.setRua("Rua Almirante Tamandaré");
        return usuarioDtoRetornadoDoSql;
    }
}
