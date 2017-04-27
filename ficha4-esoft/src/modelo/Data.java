package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by Bruno on 26/04/2017.
 */
public class Data {
    private Calendar calendar;

    public Data(int dia, int mes, int ano) {
        
        try {
            calendar = new GregorianCalendar(ano, mes - 1, dia);
            calendar.setLenient(false);
            calendar.getTime();
            
        } catch(Exception e){
            throw new IllegalArgumentException("Elementos da data invalidos");
        }
              
    }

    @Override
    public String toString() {
        String data = "";
        data += calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
        return data;
    }

    public static Data parse(String data) {
        data = data.replace("-", "/");

        ArrayList<Integer> diaMesAno = new ArrayList<>();
        for (String retVal : data.split("/")) {
            diaMesAno.add(Integer.parseInt(retVal));
        }
        return new Data(diaMesAno.get(0),diaMesAno.get(1),diaMesAno.get(2) );
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
