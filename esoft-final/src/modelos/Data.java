/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author Bruno
 */
public class Data {

    private Calendar calendar;

    public Data(int dia, int mes, int ano) {
        try {
            calendar = new GregorianCalendar(ano, mes, dia);
            calendar.setLenient(false);
            calendar.getTime();

        } catch (Exception e) {
            throw new IllegalArgumentException("Elementos da data invalidos");
        }
    }

    public static Data parse(String data) {
        data = data.replace("-", "/");

        ArrayList<Integer> diaMesAno = new ArrayList<>();
        for (String retVal : data.split("/")) {
            diaMesAno.add(Integer.parseInt(retVal));
        }

        return new Data(diaMesAno.get(0), diaMesAno.get(1), diaMesAno.get(2));
    }

    @Override
    public String toString() {
        String data = "";
        data += calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Data other = (Data) obj;
        if (!Objects.equals(this.calendar, other.calendar)) {
            return false;
        }
        return true;
    }

}
