package org.example;

public class GolpePesado extends Habilidade{
    public String nome = "Golpe Pesado";
    public int custo = 20;

    @Override
    public ResultadoHabilidade ativar(Personagem personagem) {
        ResultadoHabilidade resultado = new ResultadoHabilidade();
        resultado.dano = personagem.dano * 10;
        resultado.percentArmadura = 0.5;
        return resultado;
    }
}

