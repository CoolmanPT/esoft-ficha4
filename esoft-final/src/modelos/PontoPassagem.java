/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Bruno
 */
public class PontoPassagem {
    private String nome;
    private Horario hora;
    private Double custo;

    public PontoPassagem(String nome, Horario hora, Double custo) {
        this.nome = nome;
        this.hora = hora;
        this.custo = custo;
    }

    @Override
    public String toString() {
        String pontoPassagem ="";
        pontoPassagem += nome + " hora: " + hora + " Custo: " + custo;
        return pontoPassagem;
    }
    
    
    
}
