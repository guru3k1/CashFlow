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
public class Perro implements IPersona{
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String raza;

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public String Caminar() {
       return "Goof";
    }

    @Override
    public String Correr() {
        return "Goof, Goof";
    }

    @Override
    public String Comer() {
        return "mmmmmmmmmmmmm";
    }

    @Override
    public String Dormir() {
        return "Goof, Goof, Goof";
    }

    @Override
    public String DarNombre() {
       return this.nombre;
    }
}
