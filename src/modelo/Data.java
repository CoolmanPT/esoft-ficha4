package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Bruno on 26/04/2017.
 */
public class Data {
    private Calendar calendar;

    public Data(int dia, int mes, int ano) {
        calendar = new GregorianCalendar();
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
}
