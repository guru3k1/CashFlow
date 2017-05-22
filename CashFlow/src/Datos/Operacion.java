/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author TheGuru
 */
public class Operacion {
    private int id_operacion;
    private int tipooperacion;
    private int id_cliente;
    private int diasrestantes;
    private int importe;
    private int totalmes;
    private int promedio;
    private String detalle;
    private Date fechaoperacion;

    /**
     * @return the id_operacion
     */
    public int getId_operacion() {
        return id_operacion;
    }

    /**
     * @param id_operacion the id_operacion to set
     */
    public void setId_operacion(int id_operacion) {
        this.id_operacion = id_operacion;
    }

    /**
     * @return the tipooperacion
     */
    public int getTipooperacion() {
        return tipooperacion;
    }

    /**
     * @param tipooperacion the tipooperacion to set
     */
    public void setTipooperacion(int tipooperacion) {
        this.tipooperacion = tipooperacion;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the diasrestantes
     */
    public int getDiasrestantes() {
        return diasrestantes;
    }

    /**
     * @param diasrestantes the diasrestantes to set
     */
    public void setDiasrestantes(int diasrestantes) {
        this.diasrestantes = diasrestantes;
    }

    /**
     * @return the importe
     */
    public int getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(int importe) {
        this.importe = importe;
    }

    /**
     * @return the ingmes
     */
    public int getTotalmes() {
        return totalmes;
    }

    /**
     * @param ingmes the ingmes to set
     */
    public void setTotalmes(int ingmes) {
        this.totalmes = ingmes;
    }

    /**
     * @return the promedio
     */
    public int getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /**
     * @return the fechaoperacion
     */
    public Date getFechaoperacion() {
        return fechaoperacion;
    }

    /**
     * @param fechaoperacion the fechaoperacion to set
     */
    public void setFechaoperacion(Date fechaoperacion) {
        this.fechaoperacion = fechaoperacion;
    }
}
