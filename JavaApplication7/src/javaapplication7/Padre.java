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
public class Padre implements IPersona{

    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    
    
    public Padre (){
        nombre = "Juan";
        apellido= "Perez";
        sexo = "Masculino";
        edad = 35;
    }

    public Padre(String nombre, String apellido, String sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }
   
    
    @Override
    public String Caminar() {
        return "Estoy caminando";
    }

    @Override
    public String Correr() {
        return "Estoy corriendo";
    }

    @Override
    public String Comer() {
        return "Estoy comiendo";
    }

    @Override
    public String Dormir() {
        return "Estoy durmiendo";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String DarNombre() {
        return nombre;
    }
    
}
