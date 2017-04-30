/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class Viagem {

    private Data data;
    private int ocupacao;
    private ArrayList<PontoPassagem> pontosDePassagem;
    private Utilizador utilizador;

    public Viagem(Data data, int ocupacao, Utilizador utilizador) {
        this.data = data;
        this.ocupacao = ocupacao;
        this.utilizador = utilizador;

        pontosDePassagem = new ArrayList<>();

    }

    public void adicionarPonto(PontoPassagem p) {
        pontosDePassagem.add(p);
    }

    public ArrayList<PontoPassagem> getPontosDePassagem() {
        return (ArrayList<PontoPassagem>) pontosDePassagem.clone();
    }

    @Override
    public String toString() {
        String viagem = "";
        viagem += "Data: " + data + " Ocupacao: " + ocupacao + " Condutor: " + utilizador;
        return viagem;
    }

    public boolean verificaNome(String nomePonto) {
        if (pontosDePassagem.contains(nomePonto)) {
            return false;
        }
        return true;

    }

    public boolean verificaHora(Horario horario) {
        if (horario.getHora() < 0 || horario.getHora() > 23 || horario.getMinutos() < 0 || horario.getMinutos() > 59) {

            return false;

        } else {
            return true;
        }
    


    }
    
    

}
