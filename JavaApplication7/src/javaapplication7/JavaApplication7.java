/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author TheGuru
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     Hijo tomas = new Hijo();
     IPersona victoria = new Hijo();
     Padre sofia= new Hijo("Patin", "Primario", "20", "Sofia", "Amadori Lopez", "Femenino", 11);
     IPersona lola = new Perro("Lola", "Caniche");
     IPersona rintintin = new Perro("Rintintin", "Pastor Aleman");
     rintintin.DarNombre();
     sofia.DarNombre();
     //sofia.setApellido("Amadori");
        System.out.println(sofia.DarNombre()  +" tu apellido es? "+ sofia.getApellido());
     System.out.println("Victoria estas? "+ victoria.Caminar() );
     System.out.println("Tomas estas? "+ tomas.Caminar() );
     System.out.println(lola.DarNombre()+" esta... "+ lola.Caminar() );
     System.out.println(rintintin.DarNombre()+" es un " + rintintin.getRaza()+ " esta... "+ rintintin.Comer() );
    }
    
}
