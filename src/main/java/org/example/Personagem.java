package org.example;

import java.util.List;

public class Personagem {
    double vida;
    double armadura;
    int vigor;
    double dano;
    List<Habilidade> habilidades;

    public Personagem (double vida, double armadura, int vigor, double dano, List<Habilidade> habilidades){
     this.vida = vida;
     this.armadura = armadura;
     this.vigor = vigor;
     this.dano = dano;
     this.habilidades = habilidades;
    }


}
