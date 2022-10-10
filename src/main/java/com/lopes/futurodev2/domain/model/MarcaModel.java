package com.lopes.futurodev2.domain.model;

public class MarcaModel {
    private String nomeFantasia;

    private String razao;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    @Override
    public String toString() {
        return "MarcaModel{" +
                "nomeFantasia='" + nomeFantasia + '\'' +
                ", razao='" + razao + '\'' +
                '}';
    }
}