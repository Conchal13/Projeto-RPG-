package org.example;

public class GolpeLeve extends Habilidade{

    public String nome = "Golpe Leve";
    public int custo = 10;

    @Override
    public ResultadoHabilidade ativar(Personagem personagem) {

        ResultadoHabilidade resultado = new ResultadoHabilidade();
        resultado.dano = personagem.dano * 1;
        resultado.percentArmadura = 0.5;
        return resultado;
    }

}
