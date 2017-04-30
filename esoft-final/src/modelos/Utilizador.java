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
public class Utilizador {

    private String nome;
    private String password;

    public Utilizador(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Utilizador: " + nome;
    }
    
    

}
