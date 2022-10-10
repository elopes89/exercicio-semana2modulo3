package com.lopes.futurodev2.rest.dto;

public class ProdutoDto {
    private String nome;
    private String razao;
    private String descricao;
    private double preco;
    private String nomeFantasia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", razao='" + razao + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                '}';
    }
}
