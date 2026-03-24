package org.example;

import java.util.ArrayList;

public abstract class TiposPersonagens {

    public static ArrayList<Habilidade> getHabilidadesGuerreiro(){
        var habilidades = new ArrayList<Habilidade>();
        habilidades.add(new GolpeLeve());
        habilidades.add(new GolpePesado());
        habilidades.add(new Defender());

        return habilidades;
    }

}
