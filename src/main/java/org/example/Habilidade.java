package org.example;

public class Habilidade {

    String nome;
    int custo;
    ResultadoHabilidade ativar;

    public Habilidade(String nome, int custo, ResultadoHabilidade funcao){
        this.nome = nome;
        this.custo = custo;
        this.ativar = funcao;
    }
}
