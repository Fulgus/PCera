/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcera;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adrian
 */
@Entity
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEvento;
    private String nombre;
    private String ubicacon;
    private String descripcion;
    private Integer precio;
    @JoinTable(name = "INSCRIPCION", joinColumns = {
        @JoinColumn(name = "EVENTO_ID_EVENTO", referencedColumnName = "ID_EVENTO")}, inverseJoinColumns = {
        @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")})
    @ManyToMany
    private List<Usuario> usuarioCollection;
    @ManyToOne(optional = false)
    private Seccion seccion;

    public Evento() {
    }

    public Evento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacon() {
        return ubicacon;
    }

    public void setUbicacon(String ubicacon) {
        this.ubicacon = ubicacon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(List<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idEvento);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.ubicacon);
        hash = 53 * hash + Objects.hashCode(this.descripcion);
        hash = 53 * hash + Objects.hashCode(this.precio);
        hash = 53 * hash + Objects.hashCode(this.usuarioCollection);
        hash = 53 * hash + Objects.hashCode(this.seccion);
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.ubicacon, other.ubicacon)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.idEvento, other.idEvento)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        if (!Objects.equals(this.usuarioCollection, other.usuarioCollection)) {
            return false;
        }
        if (!Objects.equals(this.seccion, other.seccion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evento{" + "idEvento=" + idEvento + ", nombre=" + nombre + ", ubicacon=" + ubicacon + ", descripcion=" + descripcion + ", precio=" + precio + ", usuarioCollection=" + usuarioCollection + ", seccion=" + seccion + '}';
    }

   

}
