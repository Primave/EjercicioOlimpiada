package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Olimpiada
 */
public class Olimpiada {

    //Lista de Deportistas
    public List<Deportista> participantes = new ArrayList<>();

    public void inscribir(Deportista deportista){
        this.participantes.add(deportista);
    }

}