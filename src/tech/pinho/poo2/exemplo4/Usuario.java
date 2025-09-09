package tech.pinho.poo2.exemplo4;

import java.io.Serializable;

class Usuario implements Serializable {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}
