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
public class Hijo extends Padre {
    private String deporte;
    private String estudios;
    private String dedos;
    
    public Hijo() {
    }


    public Hijo(String deporte, String estudios, String dedos, String nombre, String apellido, String sexo, int edad) {
        super(nombre, apellido, sexo, edad);
        this.deporte = deporte;
        this.estudios = estudios;
        this.dedos = dedos;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    
    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getDedos() {
        return dedos;
    }

    public void setDedos(String dedos) {
        this.dedos = dedos;
    }
    
}
