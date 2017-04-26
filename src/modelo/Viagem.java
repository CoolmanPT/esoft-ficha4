package modelo;

import java.util.ArrayList;

/**
 * Created by Bruno on 26/04/2017.
 */
public class Viagem {
    private Data data;
    private int ocupacao;
    private ArrayList<PontoPassagem> pontosPassagem;
    private Utilizador utilizador;

    public Viagem(Data data, int ocupacao, Utilizador utilizador) {
        this.data = data;
        this.ocupacao = ocupacao;
        this.utilizador = utilizador;
    }

    public void adicionarPonto(PontoPassagem p) {
        //TODO
    }

    @Override
    public String toString() {

        String viagem = "";
        return viagem;

    }
}
