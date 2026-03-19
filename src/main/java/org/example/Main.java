package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Habilidade habilidade = new Habilidade("Golpe Leve", 15, ativar());
    }

    public ResultadoHabilidade ativar(){
        int dano = 5000;
        var result = new ResultadoHabilidade();

        return result;
    }
}
