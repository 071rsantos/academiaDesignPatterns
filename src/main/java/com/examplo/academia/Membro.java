package com.examplo.academia;

public class Membro {
    private String nome;
    private int id;

    public Membro(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Membro{id=" + id + ", nome='" + nome + "'}";
    }
}
