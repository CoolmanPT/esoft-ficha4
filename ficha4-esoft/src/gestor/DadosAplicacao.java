package gestor;

import modelo.Utilizador;
import modelo.Viagem;

import java.util.ArrayList;
import modelo.Data;

/**
 * Created by Bruno on 26/04/2017.
 */
public class DadosAplicacao {
    private ArrayList<Viagem> viagens;
    private ArrayList<Utilizador> utilizadores;

    private static final DadosAplicacao instancia = new DadosAplicacao();

    public DadosAplicacao() {
         viagens = new ArrayList<>();
         utilizadores = new ArrayList<>();
         
         utilizadores.add(new Utilizador("Ze", "123"));
         utilizadores.add(new Utilizador("Pedro", "abc"));
         utilizadores.add(new Utilizador("Mark", "google"));
         
         viagens.add(new Viagem(Data.parse("20/10/2017"), 2, utilizadores.get(0)));
         viagens.add(new Viagem(Data.parse("20/3/2017"), 5, utilizadores.get(1)));
         viagens.add(new Viagem(Data.parse("1/10/2017"), 4, utilizadores.get(2)));
    }
    
    public static DadosAplicacao getGestor(){
        return instancia;
    }

    public ArrayList<Viagem> getViagens() {
        return (ArrayList<Viagem>) viagens.clone();
    }

    public String getUtilizador() {
       return utilizadores.get(0).toString();
    }
}
