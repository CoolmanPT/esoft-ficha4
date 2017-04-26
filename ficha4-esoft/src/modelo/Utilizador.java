package modelo;

/**
 * Created by Bruno on 26/04/2017.
 */
public class Utilizador {
    private String nome;
    private String password;

    public Utilizador(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        String utilizador = "";
        utilizador += nome;
        return utilizador;
    }
    
    
}
