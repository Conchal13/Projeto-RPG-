package org.example;

public abstract class Habilidade {

     String nome;
     int custo;

    public abstract ResultadoHabilidade ativar(Personagem personagem);
}
