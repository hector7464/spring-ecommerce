package com.curso.ecommerce.model;

import java.util.Date;

public class Orden {
    private Integer id;
    private String numero;
    private Date fecha_Creacion;
    private Date fecha_recibida;
    private double total;
    
    public Orden() {
    }

    public Orden(Integer id, String numero, Date fecha_Creacion, Date fecha_recibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fecha_Creacion = fecha_Creacion;
        this.fecha_recibida = fecha_recibida;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha_Creacion() {
        return fecha_Creacion;
    }

    public void setFecha_Creacion(Date fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public Date getFecha_recibida() {
        return fecha_recibida;
    }

    public void setFecha_recibida(Date fecha_recibida) {
        this.fecha_recibida = fecha_recibida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden [id=" + id + ", numero=" + numero + ", fecha_Creacion=" + fecha_Creacion + ", fecha_recibida="
                + fecha_recibida + ", total=" + total + "]";
    }

    

}
