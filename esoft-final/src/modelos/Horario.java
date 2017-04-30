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
public class Horario {
    private int hora;
    private int minutos;

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        String horario = "";
        horario += hora + ":" + minutos;
        return horario;
    }
    
    public static Horario parse(String horario) {

        ArrayList<Integer> horaMinutos = new ArrayList<>();
        for (String retVal : horario.split(":")) {
            horaMinutos.add(Integer.parseInt(retVal));
        }

        return new Horario(horaMinutos.get(0), horaMinutos.get(1));
    }
    


}
