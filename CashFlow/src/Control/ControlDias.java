/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author TheGuru
 */
public class ControlDias {

    Calendar diaReal = Calendar.getInstance();
    Calendar diaAlternativo1 = Calendar.getInstance();
    Calendar diaAlternativo2 = Calendar.getInstance();
    Locale locale = Locale.getDefault();
    String fecha;
    int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public String mostrarFecha() {
        fecha = (diaReal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale)).toUpperCase()
                + " - " + Integer.toString(diaReal.get(Calendar.DATE))
                + " / " + Integer.toString(diaReal.get(Calendar.MONTH) + 1)
                + " / " + Integer.toString(diaReal.get(Calendar.YEAR));
        return fecha;
    }

    public String diasRestantes() {

        int dias = meses[diaReal.get(Calendar.MONTH)] - diaReal.get(Calendar.DATE);
        //System.out.println(dias);
        int domingos = 0;
        //int diaOriginal = c1.get(Calendar.DAY_OF_MONTH); //Backup del dia
        for (int i = 0; i < dias; i++) {
            int lafecha = diaAlternativo1.get(Calendar.DAY_OF_MONTH); //Tomo la fecha
            String dia = (diaAlternativo1.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale));
            if (dia == "domingo") {
                domingos = domingos + 1;

            }
            diaAlternativo1.set(Calendar.DAY_OF_MONTH, lafecha + 1); //Aumento un dia al calendario
        }
        //System.out.println("Domingos: "+domingos);
        //c1.set(Calendar.DAY_OF_MONTH, diaOriginal);     //Restauro dia
        //System.out.println("Dia "+c1.get(Calendar.DAY_OF_MONTH));
        return Integer.toString(dias - domingos + 1); //Sumo uno por el dia que corre
    }

    public String Promedio(int ingreso) {
        int promedio = 0;
        int diasMes = meses[diaReal.get(Calendar.MONTH)];
        int domingos = 0;
        //int diaOriginal = c1.get(Calendar.DAY_OF_MONTH); //Backup del dia
        diaAlternativo2.set(Calendar.DAY_OF_MONTH, 1);
         for (int i = 0; i < diasMes; i++) {
            int lafecha = diaAlternativo2.get(Calendar.DAY_OF_MONTH); //Tomo la fecha
            String dia = (diaAlternativo2.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale));
            if (dia == "domingo") {
                domingos = domingos + 1;

            }
            diaAlternativo2.set(Calendar.DAY_OF_MONTH, lafecha + 1); //Aumento un dia al calendario
        }

        System.out.println("Domingos " + domingos);
        //c1.set(Calendar.DAY_OF_MONTH, diaOriginal);     //Restauro dia
        promedio = ingreso / (diasMes - domingos);
        return Integer.toString(promedio);

    }

}
