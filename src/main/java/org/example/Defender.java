package org.example;

public class Defender extends Habilidade{
    public String nome = "Defender";
    public int custo = 5;

    @Override
    public ResultadoHabilidade ativar(Personagem personagem) {
        ResultadoHabilidade resultado = new ResultadoHabilidade();
        resultado.dano = 0;
        resultado.percentArmadura = 1;
        return resultado;
    }
}
