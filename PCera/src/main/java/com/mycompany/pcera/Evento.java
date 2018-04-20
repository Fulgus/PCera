/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.util.Objects;


/**
 *
 * @author adrian
 */
public class Evento {
        private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_evento;
    private String nombre;
    private String ubicacion;
    private Strin descripcion;
    private double precio;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId_evento() {
        return id_evento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Strin getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId_evento(Long id_evento) {
        this.id_evento = id_evento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setDescripcion(Strin descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.id_evento, other.id_evento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evento{" + "id_evento=" + id_evento + '}';
    }

    
}
