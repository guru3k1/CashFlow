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

    Calendar c1 = Calendar.getInstance();
    Locale locale = Locale.getDefault();
    String fecha;
    int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public String mostrarFecha() {
        fecha = (c1.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale)).toUpperCase()
                + " - " + Integer.toString(c1.get(Calendar.DATE))
                + " / " + Integer.toString(c1.get(Calendar.MONTH) + 1)
                + " / " + Integer.toString(c1.get(Calendar.YEAR));
        return fecha;
    }

    public String diasRestantes() {

        int dias = meses[c1.get(Calendar.MONTH)] - c1.get(Calendar.DATE);
        //System.out.println(dias);
        int domingos = 0;
        int fechaoriginal = c1.get(Calendar.DAY_OF_MONTH); //Backup del dia
        for (int i = 0; i < dias; i++) {
            int lafecha = c1.get(Calendar.DAY_OF_MONTH); //Tomo la fecha
            String dia = (c1.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale));
            if (dia == "domingo") {
                domingos = domingos + 1;

            }
            c1.set(Calendar.DAY_OF_MONTH, lafecha + 1); //Aumento un dia al calendario
        }
        //System.out.println("Domingos: "+domingos);
        c1.set(Calendar.DAY_OF_MONTH, fechaoriginal);     //Restauro dia
        //System.out.println("Dia "+c1.get(Calendar.DAY_OF_MONTH));
        return Integer.toString(dias - domingos + 1); //Sumo uno por el dia que corre
    }
    public String Promedio(){
    int promedio=0;
    
    
    
    
    return Integer.toString(promedio);       

    }
    public String TotaldelMes(){
    int total=0;
    
    
    
    
    return Integer.toString(total);       

    } 
   
}